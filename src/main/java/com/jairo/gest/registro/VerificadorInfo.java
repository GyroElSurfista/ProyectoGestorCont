/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.registro;

import com.jairo.gest.controllers.UsuarioController;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;

/**
 *
 * @author Jairo
 */
public class VerificadorInfo {
    
    
    
    public boolean verifUsr(String usr){
        boolean existe;
        UsuarioController uc;
        
        uc = new UsuarioController();
        
        existe = uc.usuarioRegistrado(usr);
        
        return existe;
    }
    
    public boolean verifCont(String cont){
        boolean buena;
        
        Zxcvbn zxcvbn = new Zxcvbn();
        int puntaje;
        
        Strength strength = zxcvbn.measure(cont);
        puntaje = strength.getScore();
        
        buena = puntaje >= 3;
       
        System.out.println(puntaje);
        return buena;
    }
    
    public boolean compCont(String cont, String rep){
        return cont.equals(rep);
    }
    
}
