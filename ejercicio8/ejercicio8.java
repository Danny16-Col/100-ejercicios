package ejercicio8;

import java.util.Scanner;

// Hacer un pseudocódigo que solo nos permita introducir S o N.

public class ejercicio8 {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    String a = "N";
    String b ="S";
    String usuario;

    System.out.print("Ingrese S/N: ");
    usuario = sc.nextLine();

    if (a.equals(usuario) || b.equals(usuario)) {//el .equals: es para comparar texto
        

        System.out.println("usted ingreso bien la letra");
        
    }else {
        System.out.println("usted es una mierda");
    }

    }

}
