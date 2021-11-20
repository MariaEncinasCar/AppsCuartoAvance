package repositorios;

import java.util.List;
import objetos.PostComun;

/**
 *
 * @author Equipo 4
 */
public class RepPostComun {
    
    FachadaDatos fd = new FachadaDatos();
    
    public void guardarComun(PostComun obj) {
        fd.guardarComun(obj);
    }

    public void EliminarComun(PostComun obj) {
        fd.EliminarComun(obj);
    }

    public void ActualizarComun(PostComun obj) {
        fd.ActualizarComun(obj);
    }
    
    public List<PostComun> consultarComunes() {
        return fd.consultarComunes();
    }

    public PostComun consultarComun(PostComun obj) {
        return fd.consultarComun(obj);
    }

}
