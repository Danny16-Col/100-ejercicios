package ejercicio15;

import java.util.Scanner;

/*Imprimir, contar y sumar los múltiplos de 2 
que hay entre una serie de números, tal que el 
segundo sea mayor o igual que el primero.  */
public class ejercicio15{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        int inicio = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int fin = sc.nextInt();

        // Verificar que el segundo número sea mayor o igual que el primero
        if (fin >= inicio) {
            int suma = 0;
            int contador = 0;

            System.out.println("Múltiplos de 2 entre " + inicio + " y " + fin + ":");

            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    suma += i;
                    contador++;
                }
            }

            System.out.println("Cantidad de múltiplos de 2: " + contador);
            System.out.println("Suma de múltiplos de 2: " + suma);
        } else {
            System.out.println("Error: el segundo número debe ser mayor o igual que el primero.");
        }

        sc.close();
    }
}