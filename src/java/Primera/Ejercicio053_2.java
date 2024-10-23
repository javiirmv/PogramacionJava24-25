package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio053_2 {

    public static void main(String arg[]) {

        int tabla[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

        int multiplicador = 4;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = multiplicar(multiplicador, tabla[i]);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] multiplicar(int multiplicador, int array[]) {
        int tablaMultiplicada[] = {0, 0, 0, 0};
        for (int i = 0; i < array.length; i++) {
            tablaMultiplicada[i] = array[i] * multiplicador;
        }
        return tablaMultiplicada;
    }

}
