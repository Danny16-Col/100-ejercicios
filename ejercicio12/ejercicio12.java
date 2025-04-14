package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
    
/*12. Imprima el mayor y el menor de una serie de cinco números que vamos introduciendo por 
teclado.  */
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num,mayor, menor;

    System.out.println("ingrese numero 1:");
    num = sc.nextInt();

    mayor=num;
    menor=num;

    for (int i=2; i <= 5; i++){//esta condicion nos dice que empecemos a asignarle un valor desde el conte 2

        System.out.println("ingrse numero "+i+": ");
        num = sc.nextInt();
    }

    if (num>mayor){//en cada conteo el verifica si num es mayor y se lo asigna a mayor
        mayor=num;
    }
    if (num<menor) {//en cada conteo el verifica si num es menor y si lo es lo asigna a menor
        menor=num;
    }

    System.out.println("mayor "+mayor);
    System.out.println("menor "+menor);

    sc.close();

    }
    }
