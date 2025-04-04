package ejercicio6;
//. Imprima todos los números naturales que hay desde la unidad hasta un número que 
//introducimos por teclado.

import javax.swing.JOptionPane;

public class ejercicio6 {
    
public static void main(String[] args) {
    

    int numNatural = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero natural: "));

    for (int i=0; i<=numNatural; i++){

        System.out.println("conteo: "+i);
    }
} 
}
