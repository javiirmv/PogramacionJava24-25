
package Primera;

/**
 * @author Javi 5*7 = 7+7+7+7+7
 */

public class Ejercicio011 {

    public static void main(String arg[]) {
        int num1 = 7;
        int num2 = 5;
        int aux = 0;

        for (int i = 1; i <= num2; i++) {
            aux = aux + num1;
        }

        System.out.println(num1 + " * " + num2 + " = " + aux);
    }
}
