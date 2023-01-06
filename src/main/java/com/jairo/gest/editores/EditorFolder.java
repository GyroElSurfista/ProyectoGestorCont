/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.editores;


import com.jairo.gest.controllers.FolderController;
import com.jairo.gest.usuarios.Folder;

/**
 *
 * @author Jairo
 */
public class EditorFolder {
    private String contM;
    private Folder folder;

    public EditorFolder(String contM, Folder folder) {
        this.contM = contM;
        this.folder = folder;
    }

    public boolean editarFolder(String nomFolder, String descFolder){
        boolean exito;
        FolderController fc;
        
        folder.setNomFolder(nomFolder);
        folder.setDescFolder(descFolder);
        fc      = new FolderController();
        
        exito = fc.updateFolder(folder, contM);
        return exito;
    }

    public Folder getFolder() {
        return folder;
    }
    
    
}
