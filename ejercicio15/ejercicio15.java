package ejercicio15;

import java.util.Scanner;

/*Imprimir, contar y sumar los múltiplos de 2 
que hay entre una serie de números, tal que el 
segundo sea mayor o igual que el primero.  */
public class ejercicio15{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int incio,fin;

        System.out.println("ingrese numero inicial:");
        incio = sc.nextInt();

        System.out.println("ingrese numero final:");
        fin = sc.nextInt();

        if (incio<=fin){
            int suma = 0;
            int contar = 0;

            System.out.println("los multiplos de "+incio+" y "+fin+" : ");

            for (int i = incio; i<=fin; i++ ){

                if (i%2==0){
                    System.out.println(i);
                    suma += i;
                    contar ++;
                }    
            }
            System.out.println("la cantidad de multiplos es: "+contar);
            System.out.println("la suma de todos los multiplos: "+suma);
        }else{
            System.out.println("error el segundo tiene que ser igual o mayor");
        }

        sc.close();


    }
}