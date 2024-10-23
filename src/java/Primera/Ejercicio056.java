package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio056 {

    public static void main(String arg[]) {

        int kilos[][] = {
            {5, 6, 9, 23, 7, 14, 0},
            {16, 8, 4, 33, 15, 21, 2}};

        String productos[] = {"Peras", "Manzanas"};

        int sumaKilos[] = sumar(kilos);

        
        for (int i = 0; i < kilos.length; i++){
            System.out.printf("Se han vendido %d kilos de %s\n", sumaKilos[i], productos[i]);
        }
        
    }

    public static int[] sumar(int array[][]) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int acum = 0;
            for (int j = 0; j < array[i].length; j++) {
                acum += array[i][j];
            }
            result[i] = acum;
        }
        return result;
    }
}
