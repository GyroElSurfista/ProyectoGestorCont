/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jairo
 */

@Entity
@Table(name = "CUENTA")
public class Cuenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCUENTA")
    private int codCuenta;
    
    @Column(name = "CODFOLDER")
    private int codFolder;
    
    @Column(name = "NOMCUENTA")
    private String nomCuenta;
    
    @Column(name = "USRCUENTA")
    private String usrCuenta;
    
    @Column(name = "CONTCUENTA")
    private String contCuenta;
    
    @Column(name = "DESCCUENTA")
    private String descCuenta;
    
    @Column(name = "URI")
    private String uri;

    public Cuenta() {
    }

    public Cuenta(int codCuenta, int codFolder, String nomCuenta, String usrCuenta, String contCuenta, String descCuenta, String uri) {
        this.codCuenta = codCuenta;
        this.codFolder = codFolder;
        this.nomCuenta = nomCuenta;
        this.usrCuenta = usrCuenta;
        this.contCuenta = contCuenta;
        this.descCuenta = descCuenta;
        this.uri = uri;
    }

    public Cuenta(int codFolder, String nomCuenta, String usrCuenta, String contCuenta, String descCuenta, String uri) {
        this.codFolder = codFolder;
        this.nomCuenta = nomCuenta;
        this.usrCuenta = usrCuenta;
        this.contCuenta = contCuenta;
        this.descCuenta = descCuenta;
        this.uri = uri;
    }
    
    

    public String getNomCuenta() {
        return nomCuenta;
    }

    public void setNomCuenta(String nomCuenta) {
        this.nomCuenta = nomCuenta;
    }

    public String getContCuenta() {
        return contCuenta;
    }

    public void setContCuenta(String contCuenta) {
        this.contCuenta = contCuenta;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public int getCodFolder() {
        return codFolder;
    }

    public void setCodFolder(int codFolder) {
        this.codFolder = codFolder;
    }

    public String getUsrCuenta() {
        return usrCuenta;
    }

    public void setUsrCuenta(String usrCuenta) {
        this.usrCuenta = usrCuenta;
    }

    public String getDescCuenta() {
        return descCuenta;
    }

    public void setDescCuenta(String descCuenta) {
        this.descCuenta = descCuenta;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public String toString() {
        return "Cuenta{" + "codCuenta=" + codCuenta + ", codFolder=" + codFolder + ", usrCuenta=" + usrCuenta + ", descCuenta=" + descCuenta + ", uri=" + uri + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Cuenta clone;
        
        clone = new Cuenta(codCuenta, codFolder, nomCuenta, usrCuenta, contCuenta, descCuenta, uri);
        
        return clone;
    }
    
    
    
    
    
}
