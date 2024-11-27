package Primera;

public class Ejercicio097 {

    public static void main(String[] args) {
        int vec[] = {193100, 232000, 35000, 63600, 13000};
        int divisor[] = {1, 1, 1, 1, 1};
        final int ESCANOS = 10; // FINAL = CONST, SIEMPRE MAYUSCULA

        for (int x = 0; x < ESCANOS; x++) {
            int mayor = 0;

            for (int i = 1; i < vec.length; i++) {
                if ((vec[mayor] / divisor[mayor]) < (vec[i] / divisor[i])) {
                    mayor = i;
                }

            }

            divisor[mayor] = divisor[mayor] + 1;
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.printf("Pos %d tiene %d\n", vec[i], divisor[i] - 1);
        }

    }

}
