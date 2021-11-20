<%@page import="negocio.CtrlNormal"%>
<%@page import="negocio.FabricaNegocios"%>
<%@page import="java.util.Date"%>
<%@page import="org.bson.types.ObjectId"%>
<%@page import="objetos.Normal"%>
<%@page import="objetos.Municipio"%>
<%@page import="negocio.CtrlMunicipio"%>
<%@page import="negocio.CtrlEstado"%>
<%@page import="objetos.Estado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
    FabricaNegocios fn = new FabricaNegocios();
    CtrlEstado controlEstado = fn.getCtrlEstado();
    CtrlMunicipio controlMunicipio = fn.getCtrlMunicipio();
    
    List<Municipio> municipios = controlMunicipio.consultarListaMunicipiosDelEstado();
    List<Estado>  estados = controlEstado.consultarListaEstados();

    pageContext.setAttribute("estados", estados);
    pageContext.setAttribute("municipios", municipios);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/cssInicio.css">
        <title>Login</title>
    </head>
    <body>
        
        <header>
            <h3>Blog</h3>
        </header>
        
        <form class="formulario" action="UsuarioServlet" method="post">
            <h1>Registrarse</h1>
            <p><i>${mensaje}</i></p>
            <section class="contenedor">

                <article class="input-contenedor">
                    <input id="txtNombreUsuario" type="text" name="nombreUsuario" value="${nombreUsuario}" placeholder="Nombre" required>
                    <br><br>
                </article>
                
                <article class="input-contenedor">
                    <input id="txtCorreo" type="text" name="correo" value="${correo}" placeholder="Correo electrónico" required>
                    <br><br>
                </article>
                
                <article class="input-contenedor">
                    <input id="txtContrasena" type="password" name="contrasena" value="${contrasena}" placeholder="Contraseña" required>
                    <br><br>
                </article>
                
                <article class="input-contenedor">
                    <input id="txtTelefono" type="text" name="telefono" value="${telefono}" placeholder="Teléfono" required>
                    <br><br>
                </article>
                
                <article class="input-contenedor">
                    <input id="txtAvatar" type="text" name="avatar" value="${avatar}" placeholder="Avatar" required>
                    <br><br>
                </article>
                
                <article class="input-contenedor">
                    <input id="txtCiudad" type="text" name="ciudad" value="${ciudad}" placeholder="Ciudad" required>
                    <br><br>
                </article>
                
                <article class="select-contenedor">
                    <select id="selEstado" name="selEstado" value="${est}">
                        <c:forEach var="tempEstados" items="${estados}">
                            <option value="${tempEstados.nombre}">
                                ${tempEstados.nombre}
                            </option>
                        </c:forEach>
                    </select>
                    <br><br>
                </article>
                
                <article class="select-contenedor">
                    <select id="selMunicipio" name="selMunicipio" value="${muni}">
                        <c:forEach var="tempMunicipios" items="${municipios}">
                                <option value="${tempMunicipios.nombre}">
                                ${tempMunicipios.nombre}
                                </option>
                        </c:forEach>
                    </select>
                    <br><br>
                </article>
                
                <article class="select-contenedor">
                    <input id="txtCiudad" type="date" name="nacimiento" value="${nacimiento}" placeholder="Fecha de nacimiento" required>
                    <br><br>
                </article>
                
                    <article class="radio-contenedor">
                        <label for= "genero" id="txtGen"> Género: </label> 
                        <input type="radio" id="rMasculino" name="genero" value= "masculino" value="${genero}" required>
                        <label for= "hombre"> Masculino </label>
                        <input type="radio" id="rFemenino" name="genero" value="femenino"/>
                        <label for= "femenino"> Femenino </label><br></br>
                    </article>
                
                <input type="submit" value="Registrarse" class="button">
                <p>Al registrarte, aceptas nuestras condiciones de uso y política de
                    privacidad.</p>
                <p>¿Ya tienes cuenta? <a class="link" href="login.jsp">Iniciar Sesión</a></p>

            </section>
        </form>
        <footer>
            <section class= "textobajo">
                <p>Aplicaciones webs 2021</p>
            </section>
        </footer>
    </body>
</html>
