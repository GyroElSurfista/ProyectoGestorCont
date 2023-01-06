package com.jairo.gest.genCont;
import java.util.ArrayList;
import java.util.Random;


/**
 * Write a description of class GenContrasenias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenContrasenias
{
    private ArrayList<ConjCaracteres> conj;
    
    public GenContrasenias(ArrayList<ConjCaracteres> conj){
        this.conj = conj;
    }
    
    public String genCont(int tam){
        String                  cont;
        char                    sig;
        ArrayList<Asignacion>   listaAsig;
        
        cont        = "";
        listaAsig   = genAsig(tam);
        
        for(int i = 0 ; i < tam; i++){
            sig = getRandCar(listaAsig);
            cont = cont + sig;
        }
        
        
        return cont;
    }
    
    
    private ArrayList<Asignacion> genAsig(int tam){
        ArrayList<Asignacion> asigs;
        double      porcent;
        int         cant;
        int         total;
        int         dif;
        Asignacion  asig;
        
        asigs   = new ArrayList<>();
        porcent = (1.0/tam);
        cant    = (int) (tam * porcent);
        total   = 0;
        
        for(int i = 0 ; i < conj.size() ; i++){
            asig    = new Asignacion(conj.get(i),cant);
            asigs.add(asig);
            total   += cant; 
        }
        
        dif = Math.abs(tam - total);
        
        if(total > tam){
            reducirAsig(asigs, dif);
        }else if (total < tam){
            aumentarAsig(asigs, dif);
        }
        
        return asigs;
    }
    
    private void reducirAsig(ArrayList<Asignacion> asigs, int n){
        Random rand;
        int asig;
        
        rand = new Random();
        
        for(int i = 0 ; i < n ; i++){
            asig = rand.nextInt(asigs.size());
            asigs.get(asig).incrUsos(-1);
        }
    
    }
    
    private void aumentarAsig(ArrayList<Asignacion> asigs, int n){
        Random rand;
        int asig;
        
        rand = new Random();
        
        for(int i = 0 ; i < n ; i++){
            asig = rand.nextInt(asigs.size());
            asigs.get(asig).incrUsos(1);   
        }
    }
    
    
    private char getRandCar(ArrayList<Asignacion> asigs){
        char car;
        Random rand;
        int asig;
        
        rand    = new Random();
        
        asig    = rand.nextInt(asigs.size());
        car     = asigs.get(asig).getRandChar();
          
        if(asigs.get(asig).getUsos() == 0){
            asigs.remove(asig);
        }
        
        return car;
    }
}
