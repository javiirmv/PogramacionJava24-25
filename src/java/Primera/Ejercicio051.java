package Primera;

public class Ejercicio051 {

    public static void main(String arg[]) {


        int fact1 = 5;
        int fact2 = 2;
        
        int factoriar = factorizar(fact1)/((factorizar(fact1-fact2))*factorizar(fact2));

        System.out.println(factoriar);
    }


    public static int factorizar(int fact1) {
        int aux = 1;
        for (int i = fact1; i>0; i--){
            aux *= i;
        }
        return aux;
    }

}
