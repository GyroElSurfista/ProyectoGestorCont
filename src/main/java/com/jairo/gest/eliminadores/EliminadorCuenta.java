/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.eliminadores;

import com.jairo.gest.controllers.CuentaController;
import com.jairo.gest.usuarios.Cuenta;
import com.jairo.gest.usuarios.Folder;

/**
 *
 * @author Jairo
 */
public class EliminadorCuenta {
    
    private CuentaController cc;
    
    public EliminadorCuenta(){
        cc = new CuentaController();
    }
    
    public boolean eliminarCuentas(Folder folder){
        
        return cc.eliminarCuentas(folder.getCodFolder());
    }
    
    public boolean eliminarCuenta(Cuenta cuenta){
        return cc.eliminarCuenta(cuenta);
    }
    
}
