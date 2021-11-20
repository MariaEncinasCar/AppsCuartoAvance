/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Comentario;
import objetos.PostComun;

/**
 *
 * @author Equipo 4
 */
public class CtrlComentario {
    
    FachadaNegocios fn = new FachadaNegocios();
    
    public List<Comentario> consultarListaComentariosDelPost(PostComun obj) {
        return fn.consultarListaComentariosDelPost(obj);
    }

    public void guardarComentario(Comentario obj) {
        fn.guardarComentario(obj);
    }

    public void eliminarComentarios(PostComun obj) {
        fn.eliminarComentarios(obj);
    }
    
}
