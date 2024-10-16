package Primera;

public class Ejercicio045 {

    public static void main(String arg[]) {
        String usuario = "Javier";
        String texto = "hola";
        escribir(usuario, texto);

        String frase1 = "Frase 1";
        String frase2 = " + Frase 2";

        System.out.println(concatenar(frase1, frase2));
        System.out.println(suma(5, 3));

    }

    public static void escribir(String usuario, String texto) {
        System.out.printf("%s ha dicho %s\n", usuario, texto);
    }

    public static String concatenar(String frase1, String frase2) {
        String fraseConcatenada = frase1 + frase2;
        return fraseConcatenada;
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

}
