/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.encriptacion.Encriptador;
import com.jairo.gest.usuarios.Cuenta;

import com.jairo.gest.usuarios.Folder;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Jairo
 */
public class FolderController {
    
    private SessionFactory sf;
    
    public FolderController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Folder.class).buildSessionFactory();
    }
    
    
    public boolean saveFolder(Folder folder, String contM){
        boolean exito;
        Folder clone;
        Encriptador enc;
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        
        try{
            clone   = (Folder) folder.clone();
            enc     = new Encriptador();
            
            clone.setNomFolder(enc.encriptar(clone.getNomFolder(), contM));
            clone.setDescFolder(enc.encriptar(clone.getDescFolder(), contM));
            
            session.beginTransaction();
            
            folder.setCodFolder((Integer)session.save(clone));
           
            session.getTransaction().commit();
            
            session.close();
            
            exito = true;
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    
    public Folder getFolder(int codFolder, String contM){
        Folder folder;
        Encriptador enc;
        ArrayList<Cuenta> cuentas;
        CuentaController cc;
        Session session;
        
        folder  = null;
        enc     = new Encriptador();
        session = sf.openSession();
        cc      = new CuentaController();
        
        try{
        
            session.beginTransaction();
            folder = session.get(Folder.class, codFolder);
            session.getTransaction().commit();
            session.close();
            
            folder.setNomFolder(enc.desencriptar(folder.getNomFolder(), contM));
            folder.setDescFolder(enc.desencriptar(folder.getDescFolder(), contM));
            
            
            cuentas = cc.getCuentas(codFolder, contM);
            folder.setCuentas(cuentas);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return folder;
    }
    
    public ArrayList<Folder> getFolders(int codUsr, String contM){
        ArrayList<Folder> folders;
        Folder            f;
        List<Integer> list;
        Session s;
        NativeQuery q;
        
        folders = new ArrayList<>();
        
        s       = sf.openSession();
        q      = s.createSQLQuery("SELECT CODFOLDER FROM FOLDER WHERE CODUSR = :param1");
        q.setParameter("param1", codUsr);
        
        list = q.list();
        
        for(Integer i : list){
            f = getFolder(i, contM);
            folders.add(f);
        }
        
        return folders;
        
    }
    
    public boolean eliminarFolder(Folder folder){
        boolean exito;
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        try{
            session.beginTransaction();
            session.delete(folder);
            session.getTransaction().commit();
            session.close();
            
            exito = true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    
    public boolean updateFolder(Folder folder, String contM){
        boolean exito;
        Folder clone;
        Encriptador enc;
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        
        try{
            clone   = (Folder) folder.clone();
            enc     = new Encriptador();
            
            clone.setNomFolder(enc.encriptar(clone.getNomFolder(), contM));
            clone.setDescFolder(enc.encriptar(clone.getDescFolder(), contM));
            
            session.beginTransaction();
            
            session.update(clone);
           
            session.getTransaction().commit();
            
            session.close();
            
            exito = true;
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return exito;
    }
}
