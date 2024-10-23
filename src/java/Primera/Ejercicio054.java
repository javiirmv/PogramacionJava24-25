package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio054 {

    public static void main(String arg[]) {

        int kilos[][] = {
            {5, 7, 9, 23, 7, 14, 0},
            {16, 8, 4, 33, 15, 21, 2}};

        int precios[] = {6, 7};
        multiplicar(precios, kilos);

        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                System.out.print(kilos[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void multiplicar(int[] multiplicar, int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * multiplicar[i];
            }
        }
    }

}
