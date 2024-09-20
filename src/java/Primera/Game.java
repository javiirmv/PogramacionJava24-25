package Primera;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String arg[]) {

        Random rand = new Random();

        boolean finish = false;
        int lives = 6;
        int randomNumber = rand.nextInt(101);

        System.out.println("El número aleatorio es:" + randomNumber);
        
        while (!finish && lives > 0) {

            System.out.println("Seleccione un número del 1 al 100.");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            if (num >= 0 && num <= 100) {
                lives--;
                
                if (randomNumber == num) {
                    System.out.println("Has ganado!");
                    finish = true;
                } else if (randomNumber > num){
                    System.out.println("El número introducido es menor");
                } else {
                    System.out.println("El número introducido es mayor"); 
                }

            } else {
                System.out.println("No has introducido un número del 1 al 100, vuelva a intentarlo.");
            }

            if (!finish){
                System.out.println("Te quedan " + lives + " intentos");
            }
        }
    }
}
