package Primera;

public class AA_Variaciones {

    public static void main(String arg[]) {
        int fact1 = 6;
        int fact2 = 4;
        int aux = 1;
                
        for (int i = fact1; i>fact2; i--){
            aux *= i;
        }
        
        System.out.printf("Variaciones de %d elementos tomados de %d en %d son %d\n",fact1,fact2,fact2,aux);
        
    }
}
