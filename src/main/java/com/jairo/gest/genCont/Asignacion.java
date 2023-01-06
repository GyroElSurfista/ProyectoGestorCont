package com.jairo.gest.genCont;


/**
 * Write a description of class Asignacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asignacion
{
    private ConjCaracteres conj;
    private int usos;
    
    public Asignacion(ConjCaracteres conj, int usos){
        this.conj = conj;
        this.usos = usos;
    }
    
    public char getRandChar(){
        usos = usos - 1;
        return conj.getRandChar();
    }
    
    public int getUsos(){
        return usos;
    }
    
    public void incrUsos(int cant){
        usos += cant;
        
        if(usos < 0){
            usos = 0;
        }
    }
}
