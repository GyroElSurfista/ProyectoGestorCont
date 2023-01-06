/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.usuarios;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jairo
 */

@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODUSR")
    private int codUsr;
    
    @Column(name = "USUARIO")
    private String usuario;
    
    @Column(name = "CONTM")
    private String contM;
    
    @Transient
    private ArrayList<Folder> folders;

    
    public Usuario(){
        folders = new ArrayList();
    }
    
    public Usuario(String usuario, String contM) {
        this.usuario    = usuario;
        this.contM      = contM;
        folders         = new ArrayList<>();
    }
    
    public int getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(int codUsr) {
        this.codUsr = codUsr;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContM() {
        return contM;
    }

    public void setContM(String contM) {
        this.contM = contM;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }
    
    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }
    
    public void addFolder(Folder f){
        folders.add(f);
    }
    
     @Override
    public String toString() {
        return "Usuario{" + "codUsr=" + codUsr + ", usuario=" + usuario + ", contM=" + contM + '}';
    }

}
