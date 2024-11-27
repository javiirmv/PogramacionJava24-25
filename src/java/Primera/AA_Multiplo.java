package Primera;

public class AA_Multiplo {

    public static void main(String arg[]) {
        int x;
        int y;

        int divisor;
        int dividendo;
        
        x = 8;
        y = 4;
        
        if (x > y){
            divisor = x;
            dividendo = y;
        } else {
            divisor = y;
            dividendo = x;
        }
        
        if (divisor % dividendo == 0){
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }

    }
}
