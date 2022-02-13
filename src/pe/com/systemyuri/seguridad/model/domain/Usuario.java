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
public class Usuario extends Auditoria implements Domain{
    private Integer codigo;
    private String tipo;
    private String login;
    private String clave;
    private String nombreCompleto;
    private String personalId;
    private String entidadNombre;    
    private String entidadId;    
    private String tipoDocumento;
    private String numeroDocumento;
    private Boolean flagBloqueo;
    private String email;
    private Boolean vigente;

    public Usuario(Integer codigo, String tipo, String login, String clave, String nombreCompleto, String email, Boolean vigente) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.login = login;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
        this.personalId = null;
        this.entidadNombre = null;
        this.entidadId = null;
        this.tipoDocumento = null;
        this.numeroDocumento = null;
        this.flagBloqueo = null;
        this.email = email;
        this.vigente = vigente;
    }
    public Usuario(Integer codigo) {
        super();
        this.codigo = codigo;
        this.tipo = null;
        this.login = null;
        this.clave = null;
        this.nombreCompleto = null;
        this.personalId = null;
        this.entidadNombre = null;
        this.entidadId = null;
        this.tipoDocumento = null;
        this.numeroDocumento = null;
        this.flagBloqueo = null;
        this.email = null;
        this.vigente = null;
    }
    
    public Usuario() {
        super();
        this.codigo = null;
        this.tipo = null;
        this.login = null;
        this.clave = null;
        this.nombreCompleto = null;
        this.personalId = null;
        this.entidadNombre = null;
        this.entidadId = null;
        this.tipoDocumento = null;
        this.numeroDocumento = null;
        this.flagBloqueo = null;
        this.email = null;
        this.vigente = null;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getEntidadNombre() {
        return entidadNombre;
    }

    public void setEntidadNombre(String entidadNombre) {
        this.entidadNombre = entidadNombre;
    }

    public String getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(String entidadId) {
        this.entidadId = entidadId;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Boolean getFlagBloqueo() {
        return flagBloqueo;
    }

    public void setFlagBloqueo(Boolean flagBloqueo) {
        this.flagBloqueo = flagBloqueo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.tipo);
        hash = 41 * hash + Objects.hashCode(this.login);
        hash = 41 * hash + Objects.hashCode(this.clave);
        hash = 41 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 41 * hash + Objects.hashCode(this.personalId);
        hash = 41 * hash + Objects.hashCode(this.entidadNombre);
        hash = 41 * hash + Objects.hashCode(this.entidadId);
        hash = 41 * hash + Objects.hashCode(this.tipoDocumento);
        hash = 41 * hash + Objects.hashCode(this.numeroDocumento);
        hash = 41 * hash + Objects.hashCode(this.flagBloqueo);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.vigente);
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
        return "GEN_USUARIO";
    }
    
    
}
