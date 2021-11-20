/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.CtrlEstado;
import negocio.CtrlMunicipio;
import negocio.CtrlNormal;
import negocio.FabricaNegocios;
import objetos.Estado;
import objetos.Municipio;
import objetos.Normal;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 4
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioServlet at " + request.getContextPath() + request.getAttribute("usuario")+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String url;
        String fechaNacimiento = request.getParameter("nacimiento");
       
        String buscar = "-";
        int primer = fechaNacimiento.indexOf(buscar);
        int dos = fechaNacimiento.lastIndexOf(buscar);

        int anio = Integer.parseInt(fechaNacimiento.substring(0, primer));
        int mes = Integer.parseInt(fechaNacimiento.substring((primer + 1), dos));
        int dia = Integer.parseInt(fechaNacimiento.substring((dos + 1), (fechaNacimiento.length())));

        Date fecha = new Date(anio, mes, dia);

        FabricaNegocios fn = new FabricaNegocios();
        CtrlNormal norm = fn.getCtrlNormal();
        CtrlEstado controlEstado = fn.getCtrlEstado();
        CtrlMunicipio controlMunicipio = fn.getCtrlMunicipio();

        Normal normal = new Normal();
        Municipio mun = new Municipio();
        String municipio =((String) request.getParameter("selMunicipio"));
        Estado est = new Estado();
        String estado = (String) request.getParameter("selEstado");
        
        List<Estado> estados = controlEstado.consultarListaEstados();

        normal.setNombreCompleto(request.getParameter("nombreUsuario"));
        normal.setAvatar(request.getParameter("avatar"));
        normal.setContrasena(request.getParameter("contrasena"));
        normal.setFechaNacimiento(fecha);
        normal.setGenero(request.getParameter("genero").charAt(0));
        normal.setCiudad(request.getParameter("ciudad"));
        
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getNombre().equalsIgnoreCase(estado)) {
                    est.setNombre(estados.get(i).getNombre());
                    est.setId(estados.get(i).getId());
            }
        }
        
        List<Municipio> municipios = controlMunicipio.consultarListaMunicipiosDelEstado();
        
        for (int i = 0; i < municipios.size(); i++) {
            if (municipios.get(i).getNombre().equals(municipio)) {
                if (municipios.get(i).getEstado().equals(est.getId())) {
                    mun.setEstado(municipios.get(i).getEstado());
                    mun.setNombre(municipios.get(i).getNombre());
                    mun.setId(municipios.get(i).getId());
                    normal.setMunicipio(mun.getId());
                }
            }
        }
        
        String message="";
        
        if(mun.getId()!= null){
            
            normal.setCorreo(request.getParameter("correo"));
            normal.setTelefono(request.getParameter("telefono"));
            norm.guardarUsuarioNormal(normal);
            message="Registro exitoso"+fechaNacimiento;
            url = "/login.jsp";

            request.setAttribute("usuario", normal);
            request.setAttribute("est", est);
            request.setAttribute("mun", mun);
        }
        else{
            message="Revise bien sus datos";
            response.sendRedirect("error.html");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
