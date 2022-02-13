/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.seguridad.model.domain;

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
    public String primaryKey() {
        return codigo.esNulo()?"":codigo.toString();
    }

    @Override
    public String tableName() {
        return "GEN_PERMISO";
    }
    
}
