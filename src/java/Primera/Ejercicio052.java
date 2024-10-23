package Primera;

// Sumar enteros desde programa principal y 


public class Ejercicio052 {

    public static void main(String arg[]) {

        int salarios[][] = {
            {700, 900, 1300, 800, 790, 850},
            {1000, 950, 1080, 1070, 1200, 1100},
            {1300, 930, 1200, 1170, 1000, 1000},
            {1500, 1950, 1880, 1978, 2200, 2100}};

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
