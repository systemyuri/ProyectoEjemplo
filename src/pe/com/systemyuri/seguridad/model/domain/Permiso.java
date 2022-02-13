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
public class Permiso extends Auditoria implements Domain{
    private PermisoPK codigo;      

    public Permiso(PermisoPK codigo) {
        this.codigo = codigo;
    }
    
    public Permiso() {
        this.codigo = null;
    }

    public PermisoPK getCodigo() {
        if(codigo==null)
            codigo=new PermisoPK();
        return codigo;
    }

    public void setCodigo(PermisoPK codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Permiso other = (Permiso) obj;
        return true;
    }
    
    @Override
    public String primaryKey() {
        return codigo.esNulo()?"":codigo.toString();
    }

    @Override
    public String tableName() {
        return "GEN_PERMISO";
    }
    
}
