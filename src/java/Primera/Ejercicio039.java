/*
/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio039 {

    public static void main(String arg[]) {

        int tabla1[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},};

        int acum = 0;
        
        for (int i = 0; i < tabla1.length; i++) {
            for (int j = i+1; j < tabla1[i].length; j++) {
                int aux = tabla1[j][i];
                tabla1[j][i] = tabla1[i][j];
                tabla1[i][j] = aux; 
            }
            acum++;
        }

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1[i].length; j++) {
                System.out.print(tabla1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
