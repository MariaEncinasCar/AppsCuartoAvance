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
import repositorios.FabricaDatos;
import repositorios.RepAdministrador;
import repositorios.RepComentario;
import repositorios.RepEstado;
import repositorios.RepMunicipio;
import repositorios.RepNormal;
import repositorios.RepPostAnclado;
import repositorios.RepPostComun;

/**
 *
 * @author Equipo 4
 */
public class FachadaNegocios implements INegocios {

    FabricaDatos fd = new FabricaDatos();

    private RepEstado estado = fd.getrEstado();
    private RepMunicipio municipio = fd.getrMunicipio();
    private RepAdministrador administrador = fd.getrAdministrador();
    private RepNormal normal = fd.getrNormal();
    private RepPostAnclado postAnclado = fd.getrPostAnclado();
    private RepComentario comentario = fd.getrComentario();
    private RepPostComun postComun = fd.getrPostComun();

    public FachadaNegocios() {
        
    }

    @Override
    public void guardarUsuarioAdministrador(Administrador obj) {
        administrador.guardar(obj);
    }

    @Override
    public Administrador consultarUsuarioAdministrador(Administrador obj) {
       return administrador.consultarAdmor(obj);
    }

    @Override
    public List<Administrador> consultarListaAdministradores() {
        return administrador.consultarAdmors();
    }

    @Override
    public void guardarUsuarioNormal(Normal obj) {
        normal.guardar(obj);
    }

    @Override
    public Normal consultarUsuarioNormal(Normal obj) {
        return normal.consultarNormal(obj);
    }

    @Override
    public List<Normal> consultarListaNormales() {
        return normal.consultarNormales();
    }

    @Override
    public List<Estado> consultarListaEstados() {
        return estado.consultarEstados();
    }

    @Override
    public List<Municipio> consultarListaMunicipiosDelEstado() {
         return municipio.consultarMunicipios();
    }

    @Override
    public void guardarPostAnclado(PostAnclado obj) {
         postAnclado.guardarAnclado(obj);
    }

    @Override
    public void EliminarPostAnclado(PostAnclado obj) {
        postAnclado.EliminarAnclado(obj);
    }

    @Override
    public List<PostAnclado> consultarListaPostsAnclados() {
        return postAnclado.consultarAnclados();
    }

    @Override
    public void guardarPostComun(PostComun obj) {
        postComun.guardarComun(obj);
    }

    @Override
    public void EliminarPostComun(PostComun obj) {
        postComun.EliminarComun(obj);
    }

    @Override
    public void ActualizarPostComun(PostComun obj) {
        postComun.ActualizarComun(obj);
    }

    @Override
    public List<PostComun> consultarListaPostsComunes() {
        return postComun.consultarComunes();
    }

    @Override
    public PostComun consultarPostComun(PostComun obj) {
        return postComun.consultarComun(obj);
    }

    @Override
    public List<Comentario> consultarListaComentariosDelPost(PostComun obj) {
        return comentario.consultarComentarios(obj);
    }

    @Override
    public void guardarComentario(Comentario obj) {
        comentario.guardarComentario(obj);
    }

    @Override
    public void eliminarComentarios(PostComun obj) {
        comentario.eliminarComentarios(obj);
    }
    
}
