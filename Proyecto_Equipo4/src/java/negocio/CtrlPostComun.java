/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.PostComun;

/**
 *
 * @author Equipo 4
 */
public class CtrlPostComun {
    
    FachadaNegocios fn = new FachadaNegocios();
    
    public void guardarPostComun(PostComun obj) {
        fn.guardarPostComun(obj);
    }

    public void EliminarPostComun(PostComun obj) {
        fn.EliminarPostComun(obj);
    }

    public void ActualizarPostComun(PostComun obj) {
        fn.ActualizarPostComun(obj);
    }

    public List<PostComun> consultarListaPostsComunes() {
        return fn.consultarListaPostsComunes();
    }

    public PostComun consultarPostComun(PostComun obj) {
        return fn.consultarPostComun(obj);
    }
}
