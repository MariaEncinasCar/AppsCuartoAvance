/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Administrador;
import objetos.Comentario;
import objetos.Estado;
import objetos.Municipio;
import objetos.Normal;
import objetos.PostAnclado;
import objetos.PostComun;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 4
 */
public interface INegocios {
   
    //Administrador
    
    public void guardarUsuarioAdministrador(Administrador obj);
    
    public Administrador consultarUsuarioAdministrador(Administrador obj);
    
    public List<Administrador> consultarListaAdministradores();
    
    //Normal
    
    public void guardarUsuarioNormal(Normal obj);
    
    public Normal consultarUsuarioNormal(Normal obj);
    
    public List<Normal> consultarListaNormales();
    
    //Estado
    
    public List<Estado> consultarListaEstados();
    
    //Municipio
    
    public List<Municipio> consultarListaMunicipiosDelEstado();
    
    //postAnclados
    
    public void guardarPostAnclado(PostAnclado obj);
    
    public void EliminarPostAnclado(PostAnclado obj);
    
    public List<PostAnclado> consultarListaPostsAnclados();
    
    //postComunes
    
    public void guardarPostComun(PostComun obj);
    
    public void EliminarPostComun(PostComun obj);

    public void ActualizarPostComun(PostComun obj);

    public List<PostComun> consultarListaPostsComunes();

    public PostComun consultarPostComun(PostComun obj);

    //Comentarios
    public List<Comentario> consultarListaComentariosDelPost(PostComun obj);

    public void guardarComentario(Comentario obj);

    public void eliminarComentarios(PostComun obj);
}
