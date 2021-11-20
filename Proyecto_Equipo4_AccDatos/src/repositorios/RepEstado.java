/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.List;
import objetos.Estado;

/**
 *
 * @author Equipo 4
 */
public class RepEstado {
    
    FachadaDatos fd = new FachadaDatos();
    
    public List<Estado> consultarEstados(){
        return fd.consultarEstados();
    }
}
