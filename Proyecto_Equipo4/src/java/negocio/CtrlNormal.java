/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Normal;

/**
 *
 * @author Equipo 4
 */
public class CtrlNormal {
    
    FachadaNegocios fn = new FachadaNegocios();
    
    public void guardarUsuarioNormal(Normal obj){
        fn.guardarUsuarioNormal(obj);
    }
    
    public Normal consultarUsuarioNormal(Normal obj){
        return fn.consultarUsuarioNormal(obj);
    }
    
    public List<Normal> consultarListaNormales(){
        return fn.consultarListaNormales();
    }
}
