package ejercicio17;

import java.util.Scanner;

//17. Calcular el factorial de un número
public class ejercicio17 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero : ");
        int n = sc.nextInt();
        long factorial = 1;

        for (int i=1; i<=n; i++){
            factorial*=i;
        }

        System.out.println("el factorial de "+n+" es: "+factorial);

    }    
}