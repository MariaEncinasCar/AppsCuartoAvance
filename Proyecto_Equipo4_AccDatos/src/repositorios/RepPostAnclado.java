package repositorios;

import java.util.List;
import objetos.PostAnclado;

/**
 *
 * @author Equipo 4
 */
public class RepPostAnclado {
    
    FachadaDatos fd = new FachadaDatos();
    
    public void guardarAnclado(PostAnclado obj) {
        fd.guardarAnclado(obj);
    }

    public void EliminarAnclado(PostAnclado obj) {
        fd.EliminarAnclado(obj);
    }
    
    public List<PostAnclado> consultarAnclados() {
        return fd.consultarAnclados();
    }
}
