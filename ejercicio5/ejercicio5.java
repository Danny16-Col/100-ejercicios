// Imprima los números impares hasta el 100 y que imprima cuantos impares hay.

public class ejercicio5 {

    public static void main(String[] args) {
        
        int contador=0;

        for (int i=1; i<=100; i+=2){

            System.out.println(i);
            contador ++;
            
        }
        System.out.println(contador);
    }

}

