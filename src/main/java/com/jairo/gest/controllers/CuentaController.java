/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.controllers;

import com.jairo.gest.encriptacion.Encriptador;
import com.jairo.gest.usuarios.Cuenta;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Jairo
 */
public class CuentaController {
    
    private SessionFactory sf;
    
    public CuentaController(){
        sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cuenta.class).buildSessionFactory();
    }
    
    
    public boolean saveCuenta(Cuenta cuenta, String contM){
        boolean exito;
        Cuenta clone;
        Encriptador enc;
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        
        try{
            clone   = (Cuenta) cuenta.clone();
            enc     = new Encriptador();
            
            clone.setNomCuenta(enc.encriptar(clone.getNomCuenta(), contM));
            clone.setUsrCuenta(enc.encriptar(clone.getUsrCuenta(), contM));
            clone.setContCuenta(enc.encriptar(clone.getContCuenta(), contM));
            clone.setDescCuenta(enc.encriptar(clone.getDescCuenta(), contM));
            clone.setUri(enc.encriptar(clone.getUri(), contM));
            
            session.beginTransaction();
            
            cuenta.setCodCuenta((Integer)session.save(clone));
            
            session.getTransaction().commit();
            
            session.close();
        
            exito = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    public Cuenta getCuenta(int codCuenta, String contM){
        Cuenta cuenta;
        Encriptador enc;
        Session session;
        
        cuenta  = null;
        enc     = new Encriptador();
        session = sf.openSession();
        
        try{
            
            session.beginTransaction();
            cuenta = session.get(Cuenta.class, codCuenta);
            session.close();
            
            cuenta.setNomCuenta(enc.desencriptar(cuenta.getNomCuenta(), contM));
            cuenta.setUsrCuenta(enc.desencriptar(cuenta.getUsrCuenta(), contM));
            cuenta.setContCuenta(enc.desencriptar(cuenta.getContCuenta(), contM));
            cuenta.setDescCuenta(enc.desencriptar(cuenta.getDescCuenta(), contM));
            cuenta.setUri(enc.desencriptar(cuenta.getUri(), contM));
            
      
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return cuenta;
    
    }
    
    public ArrayList<Cuenta> getCuentas(int codFolder, String contM){
        ArrayList<Cuenta> cuentas;
        Cuenta cuenta;
        List<Integer> list;
        Session s;
        NativeQuery q;
        
        cuentas = new ArrayList<>();
        s       = sf.openSession();
        
        q = s.createNativeQuery("SELECT CODCUENTA FROM CUENTA WHERE CODFOLDER = :param1");
        q.setParameter("param1", codFolder);
        
        list = q.list();
        
        for(Integer i : list){
            cuenta = getCuenta(i, contM);
            cuentas.add(cuenta);
        }
        
        
        return cuentas;
    }
    
    
    public boolean eliminarCuentas(int codFolder){
        boolean exito;
        
        Session s;
        Transaction txn;
        NativeQuery sp;
        
        
        s       = sf.openSession();
        txn     = s.beginTransaction();
        sp      = s.createSQLQuery("DELETE FROM CUENTA WHERE CODFOLDER = :param1");
        sp.setParameter("param1", codFolder);
        exito = sp.executeUpdate() >= 0;
        txn.commit();
        
        return exito;
    }
    
    public boolean eliminarCuenta(Cuenta cuenta){
        boolean exito;
        
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        try{
        
            session.beginTransaction();
            session.delete(cuenta);
            session.getTransaction().commit();
            
            exito = true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    public boolean updateCuenta(Cuenta cuenta, String contM){
        boolean exito;
        Cuenta clone;
        Encriptador enc;
        Session session;
        
        exito   = false;
        session = sf.openSession();
        
        
        try{
            clone   = (Cuenta) cuenta.clone();
            enc     = new Encriptador();
            
            clone.setNomCuenta(enc.encriptar(clone.getNomCuenta(), contM));
            clone.setUsrCuenta(enc.encriptar(clone.getUsrCuenta(), contM));
            clone.setContCuenta(enc.encriptar(clone.getContCuenta(), contM));
            clone.setDescCuenta(enc.encriptar(clone.getDescCuenta(), contM));
            clone.setUri(enc.encriptar(clone.getUri(), contM));
            
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
