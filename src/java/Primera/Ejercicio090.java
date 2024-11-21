package Primera;

public class Ejercicio090 {

    public static void main(String arg[]) {
        int num1 = 5;
        int num2 = 3;
        int resultado = multiplicar(num1, num2, 0);

        System.out.println(resultado);
    }

    public static int multiplicar(int num1, int num2, int aux) {
        if (num2 > 0) {
            aux = aux + num1;
            return multiplicar(num1, --num2, aux);

        } else {
            return aux;
        }
    }
}
