/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.generico.model.domain;

import java.util.Date;

/**
 *
 * @author systemyuri
 */
public class Auditoria {
    private Boolean auditActivo;
    private String auditUsuarioCreacion;
    private String auditUsuarioModifica;
    private String auditPersonalCreacion;
    private String auditPersonalModifica;
    private Date auditFechaCreacion;
    private Date auditFechaModifica;

    public Boolean getAuditActivo() {
        return auditActivo;
    }

    public void setAuditActivo(Boolean auditActivo) {
        this.auditActivo = auditActivo;
    }
    
    

    public String getAuditUsuarioCreacion() {
        return auditUsuarioCreacion;
    }

    public void setAuditUsuarioCreacion(String auditUsuarioCreacion) {
        this.auditUsuarioCreacion = auditUsuarioCreacion;
    }

    public String getAuditUsuarioModifica() {
        return auditUsuarioModifica;
    }

    public void setAuditUsuarioModifica(String auditUsuarioModifica) {
        this.auditUsuarioModifica = auditUsuarioModifica;
    }

    public String getAuditPersonalCreacion() {
        return auditPersonalCreacion;
    }

    public void setAuditPersonalCreacion(String auditPersonalCreacion) {
        this.auditPersonalCreacion = auditPersonalCreacion;
    }

    public String getAuditPersonalModifica() {
        return auditPersonalModifica;
    }

    public void setAuditPersonalModifica(String auditPersonalModifica) {
        this.auditPersonalModifica = auditPersonalModifica;
    }

    public Date getAuditFechaCreacion() {
        return auditFechaCreacion;
    }

    public void setAuditFechaCreacion(Date auditFechaCreacion) {
        this.auditFechaCreacion = auditFechaCreacion;
    }

    public Date getAuditFechaModifica() {
        return auditFechaModifica;
    }

    public void setAuditFechaModifica(Date auditFechaModifica) {
        this.auditFechaModifica = auditFechaModifica;
    }
    
    
}
