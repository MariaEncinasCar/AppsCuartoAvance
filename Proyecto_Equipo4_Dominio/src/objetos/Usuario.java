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
public class Usuario {

    private ObjectId id;
    private String nombreCompleto;
    private String correo;
    private String contrasena;
    private String telefono;
    private String avatar;
    private String ciudad;
    private Date fechaNacimiento;
    private char genero;
    private ObjectId municipio;

    public Usuario() {
        
    }

    public Usuario(String nombreCompleto, String correo, String contrasena, 
            String telefono, String avatar, String ciudad, Date fechaNacimiento, 
            char genero, ObjectId municipio) {
        
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.avatar = avatar;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.municipio = municipio;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public ObjectId getMunicipio() {
        return municipio;
    }

    public void setMunicipio(ObjectId municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 53 * hash + Objects.hashCode(this.correo);
        hash = 53 * hash + Objects.hashCode(this.contrasena);
        hash = 53 * hash + Objects.hashCode(this.telefono);
        hash = 53 * hash + Objects.hashCode(this.avatar);
        hash = 53 * hash + Objects.hashCode(this.ciudad);
        hash = 53 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 53 * hash + this.genero;
        hash = 53 * hash + Objects.hashCode(this.municipio);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" +"nombreCompleto=" + nombreCompleto 
                + ", correo=" + correo + ", contrasena=" + contrasena 
                + ", telefono=" + telefono + ", avatar=" + avatar + ", ciudad=" + ciudad 
                + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero 
                + ", municipio=" + municipio + '}';
    }
    
    

}
