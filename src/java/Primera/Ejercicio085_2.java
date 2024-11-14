package Primera;

public class Ejercicio085_2 {

    public static void main(String arg[]) {
        String frase1 = "Había vez circo alegraba el ";
        String frase2 = " una un que siempre corazón sin temer jamás ";
        String frase3 = "";

        int fraseIndex = 1;
        int posicion1 = 0;
        int posicion2 = 0;

        while (posicion1 != -1 || posicion2 != -1) {


            if (fraseIndex == 1 && posicion1 != -1) {
                if (frase1.indexOf(' ', posicion1 + 1) != -1) {
                    String inicio = frase1.substring(posicion1, frase1.indexOf(' ', posicion1 + 1));
                    frase3 = frase3.concat(inicio);

                    posicion1 = frase1.indexOf(' ', posicion1 + 1);
                } else {
                    posicion1 = -1;
                }

            } else if (fraseIndex == 2) {
                if (frase2.indexOf(' ', posicion2 + 1) != -1) {

                    String inicio = frase2.substring(posicion2, frase2.indexOf(' ', ++posicion2));
                    frase3 = frase3.concat(inicio);
                    posicion2 = frase2.indexOf(' ', posicion2);

                } else {
                    posicion2 = -1;
                }

            }
            if (fraseIndex == 1) {
                fraseIndex = 2;
            } else {
                fraseIndex = 1;
            }
        }
        System.out.println(frase3);

    }
}
