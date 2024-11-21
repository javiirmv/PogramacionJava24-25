package Primera;

public class Ejercicio093 {

    public static void main(String arg[]) {
        int num1 = 37;
        int num2 = 2;
        int resultado = dividir(num1, num2);

        System.out.println(resultado);
    }

    public static int dividir(int num1, int num2) {
        if (num1 < num2) {
            return 0;
        } else {
            return dividir(num1-num2, num2) +1;
        }
    }
}
