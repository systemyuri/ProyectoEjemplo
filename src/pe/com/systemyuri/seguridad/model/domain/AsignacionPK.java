/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.seguridad.model.domain;

import pe.com.systemyuri.generico.model.interfaces.Nulidad;

/**
 *
 * @author systemyuri
 */
public class AsignacionPK implements Nulidad{
    private Usuario usuario;
    private Perfil perfil;

    
    public AsignacionPK() {
        usuario=null;
        perfil=null;
    }
    public AsignacionPK(Usuario usuario, Perfil perfil) {
        this.usuario = usuario;
        this.perfil = perfil;
    }
    
    public AsignacionPK(Integer usuarioId, Integer perfilId) {
        this.usuario = new Usuario(usuarioId);
        this.perfil = new Perfil(perfilId);
    }
    
    

    public Usuario getUsuario() {
        if(usuario==null)
            usuario = new Usuario();
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        if(perfil==null)
            perfil = new Perfil();
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    public Integer getUsuarioId() {        
        return getUsuario().getCodigo();
    }

    public void setUsuarioId(Integer usuarioId) {
        getUsuario().setCodigo(usuarioId);
    }

    public Integer getPerfilId() {        
        return getPerfil().getCodigo();
    }

    public void setPerfilId(Integer perfilId) {
        getPerfil().setCodigo(perfilId);
    }

    @Override
    public Boolean esNulo() {
        return getPerfilId()==null && getUsuarioId()==null;
    }

    @Override
    public String toString() {
        return getPerfilId()+"-"+getUsuarioId();
    }
    
    
    
}
