/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.eliminadores;

import com.jairo.gest.controllers.FolderController;
import com.jairo.gest.usuarios.Folder;

/**
 *
 * @author Jairo
 */
public class EliminadorFolder {
    
    private EliminadorCuenta eliminadorC;
    private FolderController fc;
    
    public EliminadorFolder(){
        eliminadorC = new EliminadorCuenta();
        fc = new FolderController();
    }
    
    public boolean eliminarFolder(Folder folder){
        
        if(!folder.getCuentas().isEmpty()){
            eliminadorC.eliminarCuentas(folder);
        }
        
        return fc.eliminarFolder(folder);
    }
    
}
