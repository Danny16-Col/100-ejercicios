package ejercicio13;
/*13. Introducir dos números por teclado. Imprimir 
los números naturales que hay entre ambos 
números empezando por el más pequeño, contar 
cuantos hay y cuántos de ellos son pares. 
Calcular la suma de los impares.  */

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
    
    int num1,num2,par=0,inpar=0,conteo=0,suma=0;

    Scanner sc = new Scanner(System.in);

    System.out.println("introduzca el primer numero 1: ");
    num1 = sc.nextInt();

    System.out.println("introduzca el segundo numero 2: ");
    num2 = sc.nextInt();

    for (int i=num1;i<=num2; i++ ){
        System.out.println("conteo: "+i);
        conteo ++;
        suma +=i;
        if (i%2==0){
            par ++;
        }else {
            inpar +=i;
        }
    }
    System.out.println("hay:"+par+" pares");
    System.out.println("la suma de todos los inpares es: "+inpar);
    System.out.println("del numero1, al numero 2 hay: "+conteo);
    System.out.println("la suma de todos los numero es: "+suma);

    sc.close();
    
    }

}
