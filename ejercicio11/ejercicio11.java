package ejercicio11;
//Imprima los números del 1 al 100. Que calcule la suma de todos los números pares por un lado, 
//y por otro, la de todos los impares.

public class ejercicio11 {
    
    public static void main(String[] args) {
        int par=0,inpar=0;
        for (int i=0; i<=100; i++){
            System.out.println("numero: "+i);
            
            if (i%2==0){//esta condicion, nos indica que si 1 tiene un residuo igaul a 0 puede pasar
                par += i;//aca le sumamos i, entonces si pasa es porque se sumaran solo numeros enteros
            }else{//de lo contrario "else", este residuo dara otro numero por ende, sumara los numeros inpares
                inpar += i;
            }
            
        }

        System.out.println("suma par: "+par);
        System.out.println("suma inpar: "+inpar);



    }
}
