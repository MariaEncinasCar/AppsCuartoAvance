package repositorios;

import java.util.List;
import objetos.Comentario;
import objetos.PostComun;

/**
 *
 * @author Equipo 4
 */
public class RepComentario {
    
    FachadaDatos fd = new FachadaDatos();
    
    public void guardarComentario(Comentario obj) {
        fd.guardarComentario(obj);
    }
    
    public List<Comentario> consultarComentarios(PostComun obj) {
        return fd.consultarComentarios(obj);
    }
    
    public void eliminarComentarios(PostComun obj) {
        fd.eliminarComentarios(obj);
    } 
}
