

package Recursividad;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SumaRecursiva {
    
    public static void main(String[] args) {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el n: "); 
        n = entrada.nextInt();
        
        int resultado=factorialRecursivo(n);
        System.out.println(resultado);
    }
    
    
    public static int factorialRecursivo(int numero){
        
        int res =0;
        
        if(numero==1) return 1;
        else{
            res=numero+factorialRecursivo(numero-1);
        }
        
   
        return res;
        
    }
    
}
