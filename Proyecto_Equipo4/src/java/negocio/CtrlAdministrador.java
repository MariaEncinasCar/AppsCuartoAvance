/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Administrador;

/**
 *
 * @author Equipo 4
 */
public class CtrlAdministrador {
    FachadaNegocios fn = new FachadaNegocios();
    
    public void guardarUsuarioAdministrador(Administrador obj){
        fn.guardarUsuarioAdministrador(obj);
    }
    
    public Administrador consultarUsuarioAdministrador(Administrador obj){
        return fn.consultarUsuarioAdministrador(obj);
    }
    
    public List<Administrador> consultarListaAdministradores(){
        return fn.consultarListaAdministradores();
    }
}
