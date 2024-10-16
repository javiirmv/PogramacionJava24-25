package Primera;

public class Ejercicio043 {

    public static void main(String arg[]) {

        int vector[] = {25, 2, 73, 81, 16, 4, 33};

        for (int i = 0; i < vector.length - 1; i++) {
            int menor = i; 
            for (int j = i+1; j < vector.length; j++) {
                if (vector[j] < vector[menor]) {
                    menor = j;
                }
            }
            int aux = vector[i];
            vector[i] = vector[menor];
            vector[menor] = aux;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
