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
public class Lanzamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0, diez = 0, once = 0, doce = 0;

        for (int i = 0; i < 1000; i++) {

            switch (Cliente.Resultado()) {
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
                case 7:
                    siete++;
                    break;
                case 8:
                    ocho++;
                    break;
                case 9:
                    nueve++;
                    break;
                case 10:
                    diez++;
                    break;
                case 11:
                    once++;
                    break;
                case 12:
                    doce++;
                    break;
            }
        }

        System.out.println("Frecuencia Dos = " + dos);
        System.out.println("Frecuencia Tres = " + tres);
        System.out.println("Frecuencia Cuatro = " + cuatro);
        System.out.println("Frecuencia Cinco = " + cinco);
        System.out.println("Frecuencia Seis = " + seis);
        System.out.println("Frecuencia Siete = " + siete);
        System.out.println("Frecuencia Ocho = " + ocho);
        System.out.println("Frecuencia Nueve = " + nueve);
        System.out.println("Frecuencia Diez = " + diez);
        System.out.println("Frecuencia Once = " + once);
        System.out.println("Frecuencia Doce = " + doce);
        // TODO code application logic here
    }

}
