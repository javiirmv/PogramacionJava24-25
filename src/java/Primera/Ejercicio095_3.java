package Primera;

public class Ejercicio095_3 {

    public static void main(String[] args) {
        String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
        int num = 256809;

        calcular(num, medidas, 0);
    }

    public static void calcular(int num, String[] medidas, int pos) {

        if (num <= 0) {
            return;
        } else {
            calcular(num / 10, medidas, pos + 1);
            System.out.println(num % 10 + " " + medidas[pos]);
        }
    }
}
