/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.seguridad.model.domain;

import java.util.Date;
import pe.com.systemyuri.generico.model.domain.Auditoria;
import pe.com.systemyuri.generico.model.interfaces.Domain;


/**
 *
 * @author systemyuri
 */
public class Asignacion extends Auditoria implements Domain{
    private AsignacionPK codigo;    
    private Date fechaHoraInicio;
    private Date fechaHoraTermino;
    private Boolean vigente;

    public AsignacionPK getCodigo() {
        if(codigo==null)
            codigo = new AsignacionPK();
        return codigo;
    }

    public void setCodigo(AsignacionPK codigo) {
        this.codigo = codigo;
    }

    

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraTermino() {
        return fechaHoraTermino;
    }

    public void setFechaHoraTermino(Date fechaHoraTermino) {
        this.fechaHoraTermino = fechaHoraTermino;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public String primaryKey() {
        return getCodigo().esNulo()?"":getCodigo().toString();
    }

    @Override
    public String tableName() {
        return "GEN_ASIGNACION";
    }    
    
}
