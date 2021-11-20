package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 */
public class PostComun extends Post {

    public PostComun() {
    }

    public PostComun(Date fechaHoraCreacion, String titulo, String contenido, Date fechaHoraEdicion) {
        super(fechaHoraCreacion, titulo, contenido, fechaHoraEdicion);
    }
    
}
