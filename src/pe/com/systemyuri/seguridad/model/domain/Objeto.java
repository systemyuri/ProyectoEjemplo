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
public class Objeto extends Auditoria implements Domain{
    public static final String TIPO_MENU="MENU";
    public static final String TIPO_ITEM="ITEM";
    public static final String TIPO_BOTON="BOTON";
    public static final String TIPO_PAGINA="PAGINA";
    private Integer codigo;
    private String tipo;
    private String nombre;
    private String url;
    private String titulo;
    private Integer nivel;
    private Integer orden;
    private Objeto objetoPadre;
    private Boolean flagBarraMenu;
    private Boolean vigente;

    public Objeto(Integer codigo) {
        super();
        this.codigo = codigo;
    }

    public Objeto(Integer codigo, String tipo, String nombre, String url, Integer nivel, Integer orden, Objeto objetoPadre) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.url = url;
        this.nivel = nivel;
        this.orden = orden;
        this.objetoPadre = objetoPadre;
    }

    public Objeto() {
        this.codigo = null;
        this.tipo = null;
        this.nombre = null;
        this.url = null;
        this.titulo = null;
        this.nivel = null;
        this.orden = null;
        this.objetoPadre = null;
        this.flagBarraMenu = null;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Objeto getObjetoPadre() {
        if(objetoPadre==null){
            objetoPadre = new Objeto();
        }
        return objetoPadre;
    }

    public void setObjetoPadre(Objeto objetoPadre) {
        this.objetoPadre = objetoPadre;
    }

    public Boolean getFlagBarraMenu() {
        return flagBarraMenu;
    }

    public void setFlagBarraMenu(Boolean flagBarraMenu) {
        this.flagBarraMenu = flagBarraMenu;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public String primaryKey() {
        return codigo==null?"":codigo.toString();
    }

    @Override
    public String tableName() {
        return "GEN_OBJETO";
    }
    
    
}
