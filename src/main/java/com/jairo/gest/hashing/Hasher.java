/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jairo.gest.hashing;




import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 *
 * @author Jairo
 */
public class Hasher {

    
    public String hash(String plainText){
        String digest;
        digest = BCrypt.hashpw(plainText, BCrypt.gensalt(12));
        return digest;
    }
    
    public boolean checkpw(String plainText, String digest){
        boolean iguales;
        
        iguales = BCrypt.checkpw(plainText, digest);
        
        return iguales;
    }
    
}
