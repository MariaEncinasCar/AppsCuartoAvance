/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 4
 */
public class Comentario {
    
    private ObjectId id;
    private Date fechaHora;
    private String contenido;
    private ObjectId postComun;
    private ObjectId usuarioComun;
    
    public Comentario() {
        
    }
    
    public Comentario(Date fechaHora, String contenido) {
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public ObjectId getPostComun() {
        return postComun;
    }

    public void setPostComun(ObjectId postComun) {
        this.postComun = postComun;
    }
    
    public ObjectId getUsuarioComun() {
        return usuarioComun;
    }

    public void setUsuarioComun(ObjectId usuarioComun) {
        this.usuarioComun = usuarioComun;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.fechaHora);
        hash = 89 * hash + Objects.hashCode(this.contenido);
        hash = 89 * hash + Objects.hashCode(this.postComun);
        hash = 89 * hash + Objects.hashCode(this.usuarioComun);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comentario other = (Comentario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.postComun, other.postComun)) {
            return false;
        }
        if (!Objects.equals(this.usuarioComun, other.usuarioComun)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comentario{" + "fechaHora=" + fechaHora + ", contenido=" 
                + contenido + ", postComun=" + postComun + ", usuarioComun=" 
                + usuarioComun + '}';
    }
    
}
