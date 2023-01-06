/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.registro;


import com.jairo.gest.controllers.UsuarioController;
import com.jairo.gest.hashing.Hasher;


/**
 *
 * @author Jairo
 */
public class Registrador {
    private VerificadorInfo verif;
    
    public Registrador(){
        verif = new VerificadorInfo();
    }
    
    public String registrarUsuario(String usuario, String contM, String confContM){
        String mensaje;
        
        if(usuario.equals("")){
            mensaje = "Debe ingresar un usuario válido";
        }else{
            if(verif.verifUsr(usuario)){
                mensaje = "El usuario ingresado ya se encuentra registrado";
            }else{
                if(!verif.verifCont(contM)){
                    mensaje = "La contraseña maestra es muy debil";
                }else{
                    if(!verif.compCont(contM, confContM)){
                        mensaje = "Las contraseñas no coinciden";
                    }else{

                        regUsr(usuario, contM);
                        mensaje = "Registro exitoso";
                    }
                }
            }
        }
        
        return mensaje;
    }
    
    
    private void regUsr(String usr, String contM){
        
        UsuarioController uc;
        Hasher h;
        String digest;
        
        uc      = new UsuarioController();
        h       = new Hasher();
        digest  = h.hash(contM);
        
        uc.registrarUsuario(usr, digest);

    }
    
    
}
