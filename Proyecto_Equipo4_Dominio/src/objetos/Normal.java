/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 4
 */
public class Normal  extends Usuario{

    public Normal() {
        super();
    }

    public Normal(String nombreCompleto, String correo, String contrasena, 
            String telefono, String avatar, String ciudad, Date fechaNacimiento, 
            char genero, ObjectId municipio) {
        
        super(nombreCompleto, correo, contrasena, telefono, avatar, ciudad, fechaNacimiento, genero, municipio);
    }

    
}
