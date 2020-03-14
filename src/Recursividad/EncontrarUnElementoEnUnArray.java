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
public class EncontrarUnElementoEnUnArray {
    
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10}; //Creamos un array
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el n: "); 
        n = entrada.nextInt();
        int x=encontrarElemento(array, n,0);
        if(x==-1) System.out.println("No se encontro el numero en el array");
        else System.out.println("Se encontro el numero en la posiciton "+x);
    }
    
       public static int encontrarElemento(int[] array, int elementoBuscar ,int indice){
         
       if(indice==array.length || array[indice]==elementoBuscar){
             
            if(indice==array.length){
               return -1; 
            }else{
                return indice;
            }
             
        }else{
            return encontrarElemento(array, elementoBuscar, indice+1);
        }
         
    }
    
    
}
