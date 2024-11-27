package Primera;

public class AA_BinarioRecur {

    public static void main(String[] args) {
        int num = 10;

        calcular(num);
    }

    public static void calcular(int num) {
        if (num > 0) {
            calcular(num/2);
            System.out.print(num % 2);
        }
    }
}
