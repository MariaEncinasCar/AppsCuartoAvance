/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

/**
 *
 * @author Equipo 4
 */
public class FabricaDatos {
    
    private RepPostAnclado rPostAnclado;
    private RepPostComun rPostComun;
    private RepComentario rComentario;
    private RepAdministrador rAdministrador;
    private RepNormal rNormal;
    private RepEstado rEstado;
    private RepMunicipio rMunicipio;

    public RepPostAnclado getrPostAnclado() {
        if(rPostAnclado!=null){
            return rPostAnclado;
        }else{
            rPostAnclado = new RepPostAnclado();
            return rPostAnclado;
        }
    }

    public RepPostComun getrPostComun() {
        if(rPostComun!=null){
            return rPostComun;
        }else{
            rPostComun = new RepPostComun();
            return rPostComun;
        }
    }

    public RepComentario getrComentario() {
        if(rComentario!=null){
            return rComentario;
        }else{
            rComentario = new RepComentario();
            return rComentario;
        }
    }

    public RepAdministrador getrAdministrador() {
        if(rAdministrador!=null){
            return rAdministrador;
        }else{
            rAdministrador = new RepAdministrador();
            return rAdministrador;
        }
    }

    public RepNormal getrNormal() {
        if(rNormal!=null){
            return rNormal;
        }else{
            rNormal = new RepNormal();
            return rNormal;
        }
    }

    public RepEstado getrEstado() {
        if(rEstado!=null){
            return rEstado;
        }else{
            rEstado = new RepEstado();
            return rEstado;
        }
    }

    public RepMunicipio getrMunicipio() {
        if(rMunicipio!=null){
            return rMunicipio;
        }else{
            rMunicipio = new RepMunicipio();
            return rMunicipio;
        }
    }
    
    
}
