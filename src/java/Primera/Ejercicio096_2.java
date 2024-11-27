package Primera;

public class Ejercicio096_2 {

    public static void main(String[] args) {
        int num = 19;

        enBinario(num);
    }

    public static void enBinario(int num) {
        if (num != 0) {
            enBinario(num / 2);
            System.out.print(num % 2);
        }
    }
}
