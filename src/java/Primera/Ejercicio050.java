package Primera;

public class Ejercicio050 {

    public static void main(String arg[]) {

        int salarios[][] = {
            {700, 900, 1300, 800, 790, 850},
            {1000, 950, 1080, 1070, 1200, 1100},
            {1300, 930, 1200, 1170, 1000, 1000},
            {1500, 1950, 1880, 1978, 2200, 2100}};

        for (int i = 0; i < salarios.length; i++) {
            ordenar(salarios[i]);
            mostrarVector(salarios[i]);

        }

    }

    public static void ordenar(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[j] < vector[j - 1]) {
                    int inter = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = inter;
                }
            }
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

}
