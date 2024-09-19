package Primera;

public class Ejercicio010 {

    public static void main(String arg[]) {
        int factorial = 5;
        int aux = 1;
                
        for (int i = factorial; i>=1; i--){
            aux *= i;
        }
        
        System.out.println(aux);

    }
}
