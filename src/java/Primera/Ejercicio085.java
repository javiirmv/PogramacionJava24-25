package Primera;

public class Ejercicio085_2 {

    public static void main(String arg[]) {
        String frase1 = "Había vez circo alegraba el ";
        String frase2 = "una un que siempre corazón sin temer jamás ";
        String frase3 = "";

        int fraseIndex = 1;
        int posicion1 = 0;
        int posicion2 = 0;

        while (posicion1 != -1 || posicion2 != -1) {

       

            if (fraseIndex == 1 && posicion1 != -1) {
                int nextSpace = frase1.indexOf(' ', posicion1);
                if (nextSpace == -1) {
                    nextSpace = frase1.length();
                }
                String inicio = frase1.substring(posicion1, nextSpace);
                frase3 = frase3.concat(inicio + " ");
                posicion1 = (nextSpace == frase1.length()) ? -1 : nextSpace + 1;
            } else if (fraseIndex == 2 && posicion2 != -1) {
                int nextSpace = frase2.indexOf(' ', posicion2);
                if (nextSpace == -1) {
                    nextSpace = frase2.length();
                }
                String inicio = frase2.substring(posicion2, nextSpace);
                frase3 = frase3.concat(inicio + " ");
                posicion2 = (nextSpace == frase2.length()) ? -1 : nextSpace + 1;
            }

            fraseIndex = (fraseIndex == 1) ? 2 : 1;

        }
            System.out.println(frase3);

    }
}
