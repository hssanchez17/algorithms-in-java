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
public class InvertirNumero {
    
     public static void main(String[] args) {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el n: "); 
        n = entrada.nextInt();
        
        int numCifras = String.valueOf(n).length();
        
        int resultado=invertirNumero(n,numCifras-1);
        System.out.println(resultado);
    }
    
    
    public static int invertirNumero(int numero, int potencia){
        
        int res =0;
       
        if(numero<10){
            return (numero);
        }
        else{
            return numero%10 * (int)Math.pow(10, potencia) + invertirNumero(numero/10, potencia-1);
        }
        
   
               
    }
    
}
