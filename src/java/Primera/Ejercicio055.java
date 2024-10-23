package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio055 {

    public static void main(String arg[]) {

        int kilos[][] = {
            {5, 7, 9, 23, 7, 14, 0},
            {16, 8, 4, 33, 15, 21, 2}};

        int precios[] = {6, 7};

        int dinero[][] = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},};

        multiplicar(precios, kilos, dinero);
        int dinero2[][] = multiplicar(precios, kilos);

        for (int i = 0; i < dinero.length; i++) {
            for (int j = 0; j < dinero[i].length; j++) {
                System.out.print(dinero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int i = 0; i < dinero2.length; i++) {
            for (int j = 0; j < dinero2[i].length; j++) {
                System.out.print(dinero2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplicar(int[] multiplicar, int array[][], int result[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j] * multiplicar[i];
            }
        }
    }

    public static int[][] multiplicar(int[] multiplicar, int array[][]) {
        int result[][] = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j] * multiplicar[i];
            }
        }
        return result;
    }

}
