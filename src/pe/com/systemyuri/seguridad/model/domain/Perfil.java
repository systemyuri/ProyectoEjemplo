/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.seguridad.model.domain;

import java.util.Objects;
import pe.com.systemyuri.generico.model.domain.Auditoria;
import pe.com.systemyuri.generico.model.interfaces.Domain;

/**
 *
 * @author systemyuri
 */
public class Perfil extends Auditoria implements Domain{
    private Integer codigo;
    private String nombre;
    private Integer nivel;
    private Boolean vigente;    
    private Perfil perfilPadre;

    public Perfil(Integer codigo, String nombre, Integer nivel, Boolean vigente, Perfil perfilPadre) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.vigente = vigente;
        this.perfilPadre = perfilPadre;
    }
    
    public Perfil(Integer codigo) {
        super();
        this.codigo = codigo;
        this.nombre = null;
        this.nivel = null;
        this.vigente = null;
        this.perfilPadre = null;
    }
    
    public Perfil() {
        super();
        this.codigo = null;
        this.nombre = null;
        this.nivel = null;
        this.vigente = null;
        this.perfilPadre = null;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Perfil getPerfilPadre() {
        return perfilPadre;
    }

    public void setPerfilPadre(Perfil perfilPadre) {
        this.perfilPadre = perfilPadre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.nivel);
        hash = 43 * hash + Objects.hashCode(this.vigente);
        hash = 43 * hash + Objects.hashCode(this.perfilPadre);
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
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String primaryKey() {
        return codigo==null?"":codigo.toString();
    }

    @Override
    public String tableName() {
        return "GEN_PERFIL";
    }
    
}
