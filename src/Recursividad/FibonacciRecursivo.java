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
public class FibonacciRecursivo {
    
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el n: "); 
        n = entrada.nextInt();
        fibonacci(n,0,1,0);
         
        
    }
    
    public static int fibonacci(int max, int baseValue, int maxValue, int cont){
        int sum;
        if(cont==max)return 1;
        else{
            System.out.print(baseValue+",");
            sum=baseValue+maxValue;
            baseValue=maxValue;
            maxValue=sum;
            fibonacci(max,baseValue,maxValue,cont+1);    
        }
        return 1;
    }
    
}
