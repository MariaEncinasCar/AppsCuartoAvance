/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import objetos.Estado;
import java.util.List;

/**
 *
 * @author Equipo 4
 */
public class CtrlEstado {
    FachadaNegocios fn = new FachadaNegocios();
    
    public List<Estado> consultarListaEstados(){
        return fn.consultarListaEstados();
    }
}
