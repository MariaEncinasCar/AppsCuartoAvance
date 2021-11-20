package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 */
public class PostAnclado extends Post {

    public PostAnclado() {
        super();
    }

    public PostAnclado(Date fechaHoraCreacion, String titulo, String contenido, 
            Date fechaHoraEdicion) {
        super(fechaHoraCreacion, titulo, contenido, fechaHoraEdicion);
    }
    
}
