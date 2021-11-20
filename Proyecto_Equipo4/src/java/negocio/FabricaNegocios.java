package negocio;

/**
 *
 * @author Equipo 4
 */
public class FabricaNegocios {
    
    private CtrlAdministrador ctrlAdministrador;
    private CtrlComentario ctrlComentario;
    private CtrlEstado ctrlEstado;
    private CtrlMunicipio ctrlMunicipio;
    private CtrlNormal ctrlNormal;
    private CtrlPostAnclado ctrlPostAnclado;
    private CtrlPostComun ctrlPostComun;
    
    public CtrlAdministrador getCrtrAdministrador() {
        if (ctrlAdministrador != null) {
            return ctrlAdministrador;
        } else {
            ctrlAdministrador = new CtrlAdministrador();
            return ctrlAdministrador;
        }
    }
    
    public CtrlComentario getCtrlComentario() {
        if (ctrlComentario != null) {
            return ctrlComentario;
        } else {
            ctrlComentario = new CtrlComentario();
            return ctrlComentario;
        }
    }
    
    public CtrlEstado getCtrlEstado() {
        if (ctrlEstado != null) {
            return ctrlEstado;
        } else {
            ctrlEstado = new CtrlEstado();
            return ctrlEstado;
        }
    }
    
    public CtrlMunicipio getCtrlMunicipio() {
        if (ctrlMunicipio != null) {
            return ctrlMunicipio;
        } else {
            ctrlMunicipio = new CtrlMunicipio();
            return ctrlMunicipio;
        }
    }
    
    public CtrlNormal getCtrlNormal() {
        if (ctrlNormal != null) {
            return ctrlNormal;
        } else {
            ctrlNormal = new CtrlNormal();
            return ctrlNormal;
        }
    }
    
    public CtrlPostAnclado getCtrlPostAnclado() {
        if (ctrlPostAnclado != null) {
            return ctrlPostAnclado;
        } else {
            ctrlPostAnclado = new CtrlPostAnclado();
            return ctrlPostAnclado;
        }
    }
    
    public CtrlPostComun getCtrlPostComun() {
        if (ctrlPostComun != null) {
            return ctrlPostComun;
        } else {
            ctrlPostComun = new CtrlPostComun();
            return ctrlPostComun;
        }
    }
    
}
