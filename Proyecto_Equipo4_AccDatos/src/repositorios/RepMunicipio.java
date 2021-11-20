/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.List;
import objetos.Municipio;

/**
 *
 * @author Equipo 4
 */
public class RepMunicipio implements RepBase{
    
    FachadaDatos fd = new FachadaDatos();

    public List<Municipio> consultarMunicipios() {
        return fd.consultarMunicipios();
    }
}
