/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.List;
import objetos.Normal;

/**
 *
 * @author Equipo 4
 */
public class RepNormal {
    
    FachadaDatos fd = new FachadaDatos();
    
    public void guardar(Normal normal){
        fd.guardarNormal(normal);
    }
    
    public Normal consultarNormal(Normal obj){
        return fd.consultarNormal(obj);
    }
    
    public List<Normal> consultarNormales(){
        return fd.consultarNormales();
    }
    
}
