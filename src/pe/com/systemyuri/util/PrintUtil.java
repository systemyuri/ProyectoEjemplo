/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import pe.com.systemyuri.seguridad.model.domain.Usuario;

/**
 *
 * @author systemyuri
 */
public class PrintUtil {
    public void printUsuario(List<Usuario> list){
        for(Usuario item:list){
            System.out.println(item.getCodigo()+" \t "+item.getLogin()+" \t "+item.getNombreCompleto()+" \t "+item.getEmail());
        }
    }
    
    public String formatDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        
        return sdf.format(date);
    }
}
