package Primera;

public class Ejercicio044 {

    public static void main(String arg[]) {

        int vector[] = {200, 25, 2, 73, 81, 16, 4, 33,};

        for (int i = 1; i < vector.length; i++) {
            int pos = i;
            while (0 != pos && vector[pos - 1] > vector[pos]) {
                int aux = vector[pos - 1];
                vector[pos - 1] = vector[pos];
                vector[pos] = aux;
                pos--;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
