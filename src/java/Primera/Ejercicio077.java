package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio077 {

    public static void main(String arg[]) {
        String frase = "En un luegar de la mancha, de cuyo nombre no quiero acordarme";
        char[] cadena = new char[150];


        for (int i = 0; i < frase.length(); i++) {
            cadena[i] = frase.charAt(i);
        }
        
        System.out.println(cadena);
    }

}
