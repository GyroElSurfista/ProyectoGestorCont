/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.editores;

import com.jairo.gest.controllers.CuentaController;
import com.jairo.gest.usuarios.Cuenta;
import com.jairo.gest.usuarios.Folder;

/**
 *
 * @author Jairo
 */
public class EditorCuenta {
    private String contM;
    private Cuenta cuenta;

    public EditorCuenta(String contM, Cuenta cuenta) {
        this.contM = contM;
        this.cuenta = cuenta;
    }

    public boolean editarCuenta(String nomCuenta, String usrCuenta, String contCuenta, String descCuenta, String uri){
        boolean exito;
        CuentaController cc;
        
        cuenta.setNomCuenta(nomCuenta);
        cuenta.setUsrCuenta(usrCuenta);
        cuenta.setContCuenta(contCuenta);
        cuenta.setDescCuenta(descCuenta);
        cuenta.setUri(uri);
        
        cc      = new CuentaController();
        
        exito = cc.updateCuenta(cuenta, contM);
        
        return exito;
        
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    
    
}
