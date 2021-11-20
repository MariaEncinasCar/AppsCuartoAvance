/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import objetos.Administrador;
import objetos.Comentario;
import objetos.Estado;
import objetos.Municipio;
import objetos.Normal;
import objetos.PostAnclado;
import objetos.PostComun;

/**
 *
 * @author Equipo 4
 */
public class FachadaDatos implements IDatos{

    private MongoCollection<Estado> estado;
    private MongoCollection<Municipio> municipio;
    private MongoCollection<Administrador> administrador;
    private MongoCollection<Normal> normal;
    private MongoCollection<PostAnclado> postAnclado;
    private MongoCollection<PostComun> postComun;
    private MongoCollection<Comentario> comentario;
    
    public FachadaDatos() {
        estado = baseDatos.getCollection("estado", Estado.class);
        municipio = baseDatos.getCollection("municipio", Municipio.class);
        administrador = baseDatos.getCollection("administrador", Administrador.class);
        normal = baseDatos.getCollection("normal", Normal.class);
        postAnclado = baseDatos.getCollection("postAnclado", PostAnclado.class);
        postComun = baseDatos.getCollection("postComun", PostComun.class);
        comentario = baseDatos.getCollection("comentario", Comentario.class);

    }

    @Override
    public void guardarAdministrador(Administrador obj) {
        administrador.insertOne(obj);
    }

    @Override
    public Administrador consultarAdministrador(Administrador obj) {
        return administrador.find(Filters.eq("correo", obj.getCorreo())).first();
    }

    @Override
    public List<Administrador> consultarAdministrador() {
        List<Administrador> lista = new ArrayList<>();
        return administrador.find().into(lista);
    }

    @Override
    public void guardarNormal(Normal obj) {
        normal.insertOne(obj);
    }

    @Override
    public Normal consultarNormal(Normal obj) {
        return normal.find(Filters.eq("correo", obj.getCorreo())).first();
    }

    @Override
    public List<Normal> consultarNormales() {
        List<Normal> lista = new ArrayList<>();
        return normal.find().into(lista);
    }

    @Override
    public List<Estado> consultarEstados() {
        List<Estado> lista = new ArrayList<>();
        return estado.find().into(lista);
    }

    @Override
    public List<Municipio> consultarMunicipios() {
        List<Municipio> lista = new ArrayList<>();
        return municipio.find().into(lista);
        
        
    }

    @Override
    public void guardarAnclado(PostAnclado obj) {
        postAnclado.insertOne(obj);
    }

    @Override
    public void EliminarAnclado(PostAnclado obj) {
        postAnclado.deleteOne(Filters.eq("_id", obj.getId()));
    }
    
    @Override
    public List<PostAnclado> consultarAnclados() {
        List<PostAnclado> lista = new ArrayList<>();
        return postAnclado.find().into(lista);
    }

    @Override
    public void guardarComun(PostComun obj) {
        postComun.insertOne(obj);
    }

    @Override
    public void EliminarComun(PostComun obj) {
        postComun.deleteOne(Filters.eq("_id", obj.getId()));
    }

    @Override
    public void ActualizarComun(PostComun obj) {
        postComun.updateOne(Filters.eq("_id", obj.getId()),
                Updates.set("fechaHoraCreacion", obj.getFechaHoraCreacion()));
        postComun.updateOne(Filters.eq("_id", obj.getId()), 
                Updates.set("titulo", obj.getTitulo()));
        postComun.updateOne(Filters.eq("_id", obj.getId()), 
                Updates.set("contenido", obj.getContenido()));
        postComun.updateOne(Filters.eq("_id", obj.getId()), 
                Updates.set("fechaHoraEdicion", obj.getFechaHoraEdicion()));
        postComun.updateOne(Filters.eq("_id", obj.getId()), 
                Updates.set("usuario", obj.getUsuario()));
    }    

    @Override
    public List<PostComun> consultarComunes() {
        List<PostComun> lista = new ArrayList<>();
        return postComun.find().into(lista);
    }

    @Override
    public PostComun consultarComun(PostComun obj) {
        return postComun.find(Filters.eq("_id", obj.getId())).first();
    }

    @Override
    public List<Comentario> consultarComentarios(PostComun obj) {
        List<Comentario> lista = new ArrayList<>();
        return comentario.find(Filters.eq("postComun", obj.getId())).into(lista);
    }

    @Override
    public void guardarComentario(Comentario obj) {
        comentario.insertOne(obj);
    }

    @Override
    public void eliminarComentarios(PostComun obj) {
        comentario.deleteOne(Filters.eq("_id", obj.getId()));
    }
    
}
