package Primera;

public class Ejercicio006 {

    public static void main(String arg[]) {
        int x;

        x = 21;

        float lastNumber = x % 20;

        System.out.println((lastNumber / 20)+1);

        if (lastNumber == 5) {
            System.out.println("El número termina el 5");
        } else {
            System.out.println("El número no termina el 5");
        }

    }
}
