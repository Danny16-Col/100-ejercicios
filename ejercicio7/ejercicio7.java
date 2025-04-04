package ejercicio7;
//ntroducir tantas frases como queramos y contarlas.
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase = null;
        int conteo=0;

        while (frase!="0"){
            conteo++;
            System.out.println("introduzaca frase, si quiere salir coloque (salir)");
            frase = sc.nextLine();
            System.out.println(frase + " usted a introducido "+conteo+" frases " );

        }
    }
}



