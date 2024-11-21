package Primera;

public class Ejercicio095 {

    public static void main(String[] args) {
        String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
        int num = 256809;

        int resultado = calcular(num, medidas, 0);
    }

    public static int calcular(int num, String[] medidas, int pos) {

        if (num < 10) {
            System.out.println("Son " + num + " " + medidas[pos]);
            return num;
        } else {
            calcular((num / 10), medidas, pos + 1);
        }
        System.out.println("Son " + num + " " + medidas[pos]);

        return num;
    }
}
