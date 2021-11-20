/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Estado;
import objetos.Municipio;

/**
 *
 * @author Equipo 4
 */
public class CtrlMunicipio {
    
    FachadaNegocios fn = new FachadaNegocios();
     
     public List<Municipio> consultarListaMunicipiosDelEstado() {
        return fn.consultarListaMunicipiosDelEstado();
    }

}
