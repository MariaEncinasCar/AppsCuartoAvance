package repositorios;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import java.util.List;
import objetos.Administrador;
import objetos.Comentario;
import objetos.Estado;
import objetos.Municipio;
import objetos.Normal;
import objetos.PostAnclado;
import objetos.PostComun;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Interfaz de la conexión de datos con la Fábrica de Datos
 *
 */
public interface IDatos {

    public FabricaDatos fabrica = new FabricaDatos();

   
    public static final String HOST = "localhost";
    public static final String PUERTO = "27017";
    public static final String BASE_DATOS = "blog";

    public CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    public CodecRegistry codeRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

    public ConnectionString cadenaConexion = new ConnectionString(String.format("mongodb://%s/%s", HOST, PUERTO));

    public MongoClientSettings clientSetting = MongoClientSettings.builder()
            .applyConnectionString(cadenaConexion).codecRegistry(codeRegistry)
            .build();

    //conexion al servidor
    public com.mongodb.client.MongoClient mongoClient = MongoClients.create(clientSetting);

    //acceso base de datos
    public com.mongodb.client.MongoDatabase baseDatos = mongoClient.getDatabase(BASE_DATOS);
    
    //Administrador
    
    public void guardarAdministrador(Administrador obj);
    
    public Administrador consultarAdministrador(Administrador obj);
    
    public List<Administrador> consultarAdministrador();
    
    //Normal
    
    public void guardarNormal(Normal obj);
    
    public Normal consultarNormal(Normal obj);
    
    public List<Normal> consultarNormales();
    
    //Estado
    
    public List<Estado> consultarEstados();
    
    //Municipio
    
    public List<Municipio> consultarMunicipios();
    
    //postAnclados
    
    public void guardarAnclado(PostAnclado obj);
    
    public void EliminarAnclado(PostAnclado obj);
    
    public List<PostAnclado> consultarAnclados();
    
    //postComunes
    
    public void guardarComun(PostComun obj);
    
    public void EliminarComun(PostComun obj);

    public void ActualizarComun(PostComun obj);

    public List<PostComun> consultarComunes();

    public PostComun consultarComun(PostComun obj);

    //Comentarios
    public List<Comentario> consultarComentarios(PostComun obj);

    public void guardarComentario(Comentario obj);

    public void eliminarComentarios(PostComun obj);
}
