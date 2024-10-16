/*
/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio041 {

    public static void main(String arg[]) {

        int goles[][] = {
            {18, 20, 13, 14, 23},
            {15, 26, 7, 18, 13},
            {19, 10, 11, 22, 30},
            {13, 19, 15, 26, 9}};

        String futbolistas[] = {"Halland", "Mbappé", "Grizzman", "Messi", "Lamine Yamal"};

        for (int i = 0; i < futbolistas.length; i++) {
            double aux = 0;

            for (int j = 0; j < goles.length; j++) {
                aux += goles[j][i];
            }
            
            System.out.printf("La media de %s es %.2f \n", futbolistas[i], aux/goles.length);

        }

    }
}
