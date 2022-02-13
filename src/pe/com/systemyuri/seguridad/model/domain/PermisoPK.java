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
public class PermisoPK implements Nulidad{
    private Perfil perfil;
    private Objeto objeto;

    public PermisoPK() {
        this.perfil = null;
        this.objeto = null;
    }
    
    public PermisoPK(Perfil perfil, Objeto objeto) {
        this.perfil = perfil;
        this.objeto = objeto;
    }
    
    public PermisoPK(Integer perfilId, Integer objetoId) {
        this.perfil = new Perfil(perfilId);
        this.objeto = new Objeto(objetoId);
    }
    
    

    public Perfil getPerfil() {
        if(perfil==null)
            perfil=new Perfil();
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Objeto getObjeto() {
        if(objeto==null)
            objeto=new Objeto();
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
    
    public Integer getPerfilId() {        
        return getPerfil().getCodigo();
    }

    public void setPerfilId(Integer perfilId) {
        getPerfil().setCodigo(perfilId);
    }

    public Integer getObjetoId() {        
        return getObjeto().getCodigo();
    }

    public void setObjetoId(Integer objetoId) {
        getObjeto().setCodigo(objetoId);
    }
    
    
    
    @Override
    public Boolean esNulo() {
        return getObjetoId()==null && getPerfilId()==null;
    }

    @Override
    public String toString() {
        return getPerfilId()+"-"+getObjetoId();
    }
    
    
    
}
