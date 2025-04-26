package ejercicio16;

import java.util.Scanner;

/*Contar las veces que aparece una determinada
letra en una frase que introduciremos por 
teclado.  */
public class ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println("Introduce una letra: ");
        String letra = sc.nextLine();
        int contador = 0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)==letra.charAt(0)){
                contador++;
            }
        }
        System.out.println(contador);

    }
}
