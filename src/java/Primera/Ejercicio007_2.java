package Primera;

public class Ejercicio007_2 {

    public static void main(String arg[]) {
        int x;
        int y;
        int aux;

        x = 4;
        y = 8;

        if (x < y) {
            aux = x;
            x = y;
            y = aux;
        }

        if (x % y == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }

    }
}
