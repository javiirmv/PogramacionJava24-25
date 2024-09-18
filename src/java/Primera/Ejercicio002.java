

package Primera;

import java.util.Random;


public class Ejercicio002 {
    public static void main (String arg[]){
        
        Random rand = new Random();

        int x,y;
        y = rand.nextInt(100) + 1;
        x = 50;
            
        System.out.println("El número random de y es: " + y);
        
        if(y > x){
            System.out.println("Y es mayor que X");
        } else if (x > y) {
            System.out.println("X es mayor que y");
        } else {
            System.out.println("Son iguales");
        }
    }
}
