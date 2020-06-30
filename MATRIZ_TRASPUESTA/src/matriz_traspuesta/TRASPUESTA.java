/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_traspuesta;

/**
 *
 * @author Uziel
 */
public class TRASPUESTA {
    
    public static int trasponer(int largo, int ancho, int NI, int NF)
    { 
        int MATRIZ[][] = new int[largo][ancho];
        
       NF=NF+1;
       NI=NI-1;
       
        System.out.print("Array Original...\n\n");
        for(int L=0;L<largo;L++)
        {
            for(int A=0; A<ancho; A++)
            {
                
        
       MATRIZ[L][A]= (int) (Math.random()*NF+NI);
       System.out.print("["+MATRIZ[L][A]+"]"+" "); 
     
       
}
        System.out.print("\n");   
       
        }
        
  
        
        int MATRIZ2[][] = new int[ancho][largo];
        System.out.print("Array Traspuesto...\n\n");
        for(int L=0;L<largo;L++)
        {
            for(int A=0; A<ancho; A++)
            {   
       MATRIZ2[A][L]= MATRIZ[L][A];    
       
}
        }
            
            for(int L=0;L<ancho;L++)
        {
            for(int A=0; A<largo; A++)
            {   
            
        System.out.print("["+MATRIZ2[L][A]+"]"+" "); 
       
        }
              System.out.print("\n");   
            
        }
      
    
        return 0;
        
    }
}
        
    
  
    

