/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamiento;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    
    public static int Resultado (){
        
        int suma = 0;
        
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        
        
        suma = (dado1.lanzar()) + (dado2.lanzar());
        
        return suma;
    }
    
}
