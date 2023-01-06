package com.jairo.gest.genCont;
import java.util.ArrayList;
import java.util.Random;

public class ConjCaracteres
{
    private ArrayList<Integer[]> conj;
    
    
    public ConjCaracteres(ArrayList<Integer[]> conj){
        this.conj = conj;
    }
    
    public char getRandChar(){
        Random rand;
        Integer[] sub;
        int subconj;
        int caracter;
        int dif;
        
        rand        = new Random();
        
        subconj     = rand.nextInt(conj.size());
        sub         = conj.get(subconj);
        
        dif         = sub[1] - sub[0];
        
        if(dif <= 0){
            dif = 1;
        }
        
        caracter    = rand.nextInt(dif) + sub[0]; 
        
        
        
        return (char) caracter;
    }
}
