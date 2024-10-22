package Primera;

public class Ejercicio049 {

    public static void main(String arg[]) {

        int vector[] = {25, 2, 73, 81, 16, 4, 33};

        ordenar(vector);
        mostrarVector(vector);

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
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

}
