/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.systemyuri.main;

import java.util.ArrayList;
import java.util.List;
import pe.com.systemyuri.seguridad.model.domain.Usuario;
import pe.com.systemyuri.util.PrintUtil;

/**
 *
 * @author systemyuri
 */
public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios=new ArrayList<>();
        usuarios.add(new Usuario(1, "INTERNO", "dyurivilca", "123", "David Yurivilca", "system.yuri@gmail.com", true));
        usuarios.add(new Usuario(2, "INTERNO", "eespinozar", "123", "Everli Espinoza", "eespinozar@minjus.gob.pe", true));
        usuarios.add(new Usuario(3, "INTERNO", "adelgado", "123", "Angie Delgado", "eespinozar@minjus.gob.pe", true));
        usuarios.add(new Usuario(4, "INTERNO", "psoria", "123", "Percy Soria", "psoria@minjus.gob.pe", true));
        
        usuarios.add(new Usuario(5, "INTERNO", "msalinas", "123", "Mario Salinas", "msalinas@minjus.gob.pe", true));
        usuarios.add(new Usuario(6, "INTERNO", "cverde", "123", "Cesar Verde", "cverde@minjus.gob.pe", true));
        
        PrintUtil printUtil = new PrintUtil();
        printUtil.printUsuario(usuarios);
    }
}
