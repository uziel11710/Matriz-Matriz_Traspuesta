/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_traspuesta;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class MATRIZ_TRASPUESTA {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
        int NI,NF;
        int largo,ancho;
 
       System.out.println("INGRESA EL RANGO INICIAL DE NUMEROS AL AZAR:  ");
       NI=leer.nextInt();
       System.out.println("INGRESA EL RANGO FINAL DE NUMEROS AL AZAR:  ");
       NF=leer.nextInt();
       
       System.out.println("----DIMENSIONA TU MATRIZ----\n");
       
       System.out.println("INGRESA NUMERO DE FILAS:  ");
       largo=leer.nextInt();
       System.out.println("INGRESA NUMERO DE COLUMNAS:  ");
       ancho=leer.nextInt();
       
       TRASPUESTA enviar = new TRASPUESTA();
       enviar.trasponer(largo, ancho, NI, NF);
       
       
    }
    
}
