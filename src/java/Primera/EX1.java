package Primera;

//Numero es primo si es divisible entre el mismo y el 1
public class EX1 {

    public static void main(String[] args) {
        int number = 2;

        System.out.println(esPrimo(number));
    }

    public static boolean esPrimo(int number) {
        int div = number;

        while (div > 1) {
            div--;
            if (number % div == 0) {
                return false;
            } else if (div == 2) {
                return true;
            }

        }
        return true;
    }
}
