package Primera;

public class Ejercicio012 {

    public static void main(String arg[]) {
        int fact1 = 7;
        int fact2 = 4;
        int aux = 1;
                
        for (int i = fact1; i>fact2; i--){
            aux *= i;
        }
        
        System.out.println(aux);

    }
}
