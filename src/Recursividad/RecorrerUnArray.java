/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author pc
 */
public class RecorrerUnArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10}; //Creamos un array
        recorrerArray(array, 0); //Pasamos el array y la posicion donde empieza  
    }
    
    public static int recorrerArray(int[] array, int indice){
        
        if(indice==array.length)return 1;
        else{
            System.out.println(array[indice]);
            recorrerArray(array, indice+1);
        }
        return 1;
    }
    
}
