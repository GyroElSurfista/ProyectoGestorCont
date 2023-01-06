/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.genCont;

import java.util.ArrayList;

/**
 *
 * @author Jairo
 */
public class CreadorGenCont {
    
    private ArrayList<String> conj;
    
    public CreadorGenCont(){
        conj = new ArrayList<>();
    }
    
    public void addConj(String conjS){
        //Formato: (a1,b1)u(a2,b2)u(a3,b3)u...u(an,bn)
        conj.add(conjS);
    }
    
    public GenContrasenias crear(){
        GenContrasenias nuevo;
        ArrayList<ConjCaracteres> conjC;
        
        conjC = genConjCaract();
        
        nuevo = new GenContrasenias(conjC);
        
        return nuevo;
    }
    
    private ArrayList<ConjCaracteres> genConjCaract(){
        ArrayList<ConjCaracteres> conjsC;
        
        conjsC = new ArrayList<>();
        
        for(String s: conj){
            ConjCaracteres c;
            c = genConj(s);
            conjsC.add(c);
        }
        
        return conjsC;
    }
    
    private ConjCaracteres genConj(String formato){
        ConjCaracteres conjC;
        ArrayList<Integer[]> intervalos;
        String[] intervString;
        
        intervString    = formato.split("u");
        intervalos      = new ArrayList<>();
        
        for(String s: intervString){
            String[]  numeros;
            Integer[] intervInt;
            
            numeros     = s.split(",");
            intervInt   = new Integer[2];
            
            intervInt[0] = Integer.parseInt(numeros[0].substring(1));
            intervInt[1] = Integer.parseInt(numeros[1].substring(0, numeros[1].length() - 1));
            
            intervalos.add(intervInt);
        }
        
        conjC = new ConjCaracteres(intervalos);
        
        return conjC;
    }
    
}
