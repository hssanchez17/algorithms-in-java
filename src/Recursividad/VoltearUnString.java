/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class VoltearUnString {
         public static void main(String[] args) {
        String n;
        
        Scanner entrada = new Scanner(System.in);
        entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el string: "); 
        n = entrada.nextLine ();
        
       
      

         
        String resultado=invertirString(n,n.length()-1);
        System.out.println(resultado);
    }
    
    
    public static String invertirString(String palabra,int indice){
        
        if(indice==0){
            return palabra.charAt(indice)+"";
        }
        else{
            String z=invertirString(palabra, indice-1);
            return palabra.charAt(indice)+z;
        }
        
        
        
   
        
    }
    
}

    

