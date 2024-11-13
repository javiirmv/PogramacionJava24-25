package Primera;

public class Ejercicio078 {

    public static void main(String arg[]) {
        String nombres[] = {"Pepe", "Juan", "Maria", "Antonio", "Luis"};

        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1; j++) {
                if (nombres[j].compareTo(nombres[j +1 ]) > 0) {
                    String inter = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = inter;
                }
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
