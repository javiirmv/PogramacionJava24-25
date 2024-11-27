package Primera;

public class AA_Factorizar {

    public static void main(String arg[]) {

        int fact1 = 5;

       
        int factoriar = factorizar(fact1);

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
