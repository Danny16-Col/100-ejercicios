//Imprima la suma de los 100 primeros números.
public class ejercicio4 {

    public static void main(String[] args) {
        int suma=0;

        for (int i = 0; i<=100; i++){
            
            suma += i;
            System.out.println(i+" = "+suma);

        }
    }
}