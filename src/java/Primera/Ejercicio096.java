package Primera;

public class Ejercicio096 {

    public static void main(String[] args) {
        int num = 10;

        int resultado = calcular(num);
    }

    public static int calcular(int num) {

        if (num < 2) {
        System.out.print(num % 2);
            return num;
        } else {
            calcular((num / 2));
        }
        System.out.print(num % 2);

        return num;
    }
}
