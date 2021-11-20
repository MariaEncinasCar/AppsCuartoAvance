/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.List;
import objetos.Administrador;

/**
 *
 * @author Equipo 4
 */
public class RepAdministrador {
     
    FachadaDatos fd = new FachadaDatos();
    
    public void guardar(Administrador admor){
        fd.guardarAdministrador(admor);
    }
    
    public Administrador consultarAdmor(Administrador obj){
        return fd.consultarAdministrador(obj);
    }
    
    public List<Administrador> consultarAdmors(){
        return fd.consultarAdministrador();
    }

}
