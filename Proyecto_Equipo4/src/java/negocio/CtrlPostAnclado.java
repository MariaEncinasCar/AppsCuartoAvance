/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.PostAnclado;

/**
 *
 * @author Equipo 4
 */
public class CtrlPostAnclado {
    
    FachadaNegocios fn = new FachadaNegocios();
    
    public void guardarPostAnclado(PostAnclado obj) {
        fn.guardarPostAnclado(obj);
    }

    public void EliminarPostAnclado(PostAnclado obj) {
        fn.EliminarPostAnclado(obj);
    }

    public List<PostAnclado> consultarListaPostsAnclados() {
        return fn.consultarListaPostsAnclados();
    }
}
