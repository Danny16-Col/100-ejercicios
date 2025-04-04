package ejercicio10;

import javax.swing.JOptionPane;

public class ejercicio10 {
    
    public static void main(String[] args) {
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));

        numero = numero%2;

        if (numero==0){
            System.out.println("su numero es par");
        }else if (numero !=0){
            System.out.println("su numero es inpar");
        }else {
            System.out.println("ERROR");
        }
    }
}
