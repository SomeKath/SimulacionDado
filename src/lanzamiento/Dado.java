/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamiento;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    
    public static int lanzar (){
        
        Random n = new Random();
        
        int numero = n.nextInt(6);
        
        return numero+1;
        
    }
    
}
