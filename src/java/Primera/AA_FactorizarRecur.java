package Primera;

public class AA_FactorizarRecur {

    public static void main(String arg[]) {
        int num1 = 5;
        int resultado = factorizar(num1);

        System.out.println(resultado);
    }

    public static int factorizar(int num1) {
        if (num1 == 1) {
            return num1;
        } else {
            return factorizar(num1-1) * num1;
        }
    }
}
