/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.inicioSesion;

import com.jairo.gest.controllers.UsuarioController;
import com.jairo.gest.hashing.Hasher;
import com.jairo.gest.usuarios.Usuario;

/**
 *
 * @author Jairo
 */
public class InicioSesion {
    
    
    public Usuario iniciarSesion(String usr, String contM){
       Usuario usuario;
       UsuarioController uc;
       Hasher h;
       
       uc = new UsuarioController();
       h  = new Hasher();
       
       usuario = uc.getUsuario(usr, contM);

       return usuario;
    }
}
