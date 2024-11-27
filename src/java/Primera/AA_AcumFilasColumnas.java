/*
Acumular por filas y por columnas
            System.out.println(acumFilas[i]);
            System.out.println(acumColumnas[i]);

 */
package Primera;

public class AA_AcumFilasColumnas {

    public static void main(String arg[]) {

        int tabla[][] = {
            {10, 20, 30, 40},
            {50, 60, 70, 80,},
            {90, 100, 110, 120}};

        int acumFilas[] = {0, 0, 0};
        int acumColumnas[] = {0, 0, 0, 0};

        System.out.println("Acum filas");

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                acumFilas[i] += tabla[i][j];
                acumColumnas[j] += tabla[i][j];
            }
            System.out.println(acumFilas[i]);
        }

        System.out.println("Acum columnas");

        for (int i = 0; i <= tabla.length; i++) {
            System.out.println(acumColumnas[i]);
        }
    }
}
