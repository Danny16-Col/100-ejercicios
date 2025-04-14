package ejercicio14;

import java.util.Scanner;

/* Imprimir diez veces la serie de números del 1 al 10.  */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("ingrese numero limite");
            num1 = sc.nextInt();

        for (int i = 1; i<=num1; i++){

            System.out.println("serie #: "+i);

            for (int j = 1; j<=num1; j++ ){

                System.out.println("numero: "+j);
            }
        System.out.println();

        }

    }
}
