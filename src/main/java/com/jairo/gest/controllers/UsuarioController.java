/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.hashing.Hasher;
import com.jairo.gest.usuarios.Folder;
import com.jairo.gest.usuarios.Usuario;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Jairo
 */
public class UsuarioController {
    
    private SessionFactory sf;
    
    
    public UsuarioController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
    }
    
    public int usuarioRegistrado(String usuario, String contM){
        int codUsr;
        String digest;
        Hasher hasher;
        Session s;
        NativeQuery sp;
        Object[] result;
        
        hasher  = new Hasher();
        s       = sf.openSession();
        sp      = s.createSQLQuery("SELECT CODUSR, CONTM FROM USUARIO WHERE USUARIO = :param1");
        sp.setParameter("param1", usuario);
        
        result = (Object[])(sp.uniqueResult());
        
        if(result != null){
           
            digest = (String)result[1];
            
            if(hasher.checkpw(contM, digest)){
                codUsr = (int)result[0];
            }else{
                codUsr = -1;
            }
            
        }else{
            codUsr = -1;
        }
        
        return codUsr;
    }
    
    public boolean usuarioRegistrado(String usuario){
        boolean registrado;
        Session s;
        NativeQuery sp;
        
        
        s       = sf.openSession();
        sp      = s.createSQLQuery("EXECUTE CompUsrExist :param1");
        sp.setParameter("param1", usuario);
        
        registrado = sp.uniqueResult() != null;
        
        return registrado;
    }
    
    public void registrarUsuario(String usuario, String contM){
        
        Session s;
        Transaction txn;
        NativeQuery sp;
        
        
        s       = sf.openSession();
        txn     = s.beginTransaction();
        sp      = s.createSQLQuery("EXECUTE RegUsr :param1, :param2");
        sp.setParameter("param1", usuario);
        sp.setParameter("param2", contM);
        sp.executeUpdate();
        txn.commit();
        
        
        
    
    }
    
    public Usuario getUsuario(String usr, String contM){
        Usuario usuario;
        int     codUsuario;
        
        usuario = null;
        codUsuario = usuarioRegistrado(usr, contM);
        
        if(codUsuario > 0){
            usuario = getUsuario(codUsuario);
        }
   
        return usuario;
    }
    
    public Usuario getUsuario(int codUsr){
        
        Usuario usr;
        ArrayList<Folder> folders;
        FolderController fc;
        
        usr = null;
        fc  = new FolderController();
        Session session = sf.openSession();
        
        try{
            
            session.beginTransaction();
            usr = session.get(Usuario.class, codUsr);
            session.getTransaction().commit();
            session.close();
            
            folders = fc.getFolders(codUsr, usr.getContM());
            
            usr.setFolders(folders);
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return usr;
    }
    
    
    
}
