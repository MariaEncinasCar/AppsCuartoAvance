/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 4
 */
public class Municipio {
    
    private ObjectId id;
    private String nombre;
    private ObjectId estado;

    public Municipio() {
        
    }
    
    public Municipio(String nombre, ObjectId estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.estado);
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
        final Municipio other = (Municipio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public ObjectId getEstado() {
        return estado;
    }

    public void setEstado(ObjectId estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
