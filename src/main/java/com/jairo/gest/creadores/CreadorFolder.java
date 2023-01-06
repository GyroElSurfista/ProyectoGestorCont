/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.creadores;

import com.jairo.gest.controllers.FolderController;
import com.jairo.gest.usuarios.Folder;
import com.jairo.gest.usuarios.Usuario;

/**
 *
 * @author Jairo
 */
public class CreadorFolder {
    
    private Usuario usuario;

    public CreadorFolder(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean crearFolder(String nomFolder, String descFolder){
        boolean exito;
        Folder folder;
        FolderController fc;
        
        fc      = new FolderController();
        folder  = new Folder(usuario.getCodUsr(), nomFolder, descFolder);
        
        exito = fc.saveFolder(folder, usuario.getContM());
        usuario.addFolder(folder);
        
        return exito;
        
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
}
