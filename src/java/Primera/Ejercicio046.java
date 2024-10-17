package Primera;

public class Ejercicio046 {

    public static void main(String arg[]) {

        int vector[] = {2, 6, 10, 13};
        int vector2[] = {2, 61, 10, 13};

        System.out.println(maximo(vector));
        System.out.println(maximo(vector2));

    }

    public static int maximo(int vector[]) {

        int maximo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

        return maximo;
    }

}
