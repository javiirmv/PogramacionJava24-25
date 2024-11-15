package Primera;

public class Ejercicio086 {

    public static void main(String[] args) {
        String frase1 = "Había una vez, un circo, que alegraba siempre el corazón.";
        String frase2 = "";

        for (int i = frase1.length() - 1; i >= 0; i--) {
            frase2 = frase2.concat(frase1.charAt(i)); 
        }

        System.out.println(frase2);
    }
}
