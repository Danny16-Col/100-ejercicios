package ejercicio9;

import java.util.Scanner;

//introducir un número por teclado. Que nos diga si es positivo o negativo.
public class ejercicio9 {
    
    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner(System.in);

            System.out.println("ingrese numero, ya sea negativo o positivo: ");
            numero = sc.nextInt();
        
            if (numero>0){
                System.out.println("su numero es positivo");
            }else if(numero<0) {
                System.out.println("su numero es negativo");
            }
            else{
                System.out.println("su numero es 0, por lo tanto no es negativo ni positivo");
            }

    }
}
