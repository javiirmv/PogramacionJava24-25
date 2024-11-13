package Primera;

public class Ejercicio081 {

    public static void main(String arg[]) {
        String frase[] = {"En un lugar", "de la Mancha", ",de cuyo nombre", "no quiero acordarme"};

        int cont = 0;
        
        for (int i = 0; i<frase.length; i++){
            for (int j = 0; j < frase[i].length(); j++){
                if (frase[i].charAt(j) == 'a'){
                    cont++;
                }
            }
        }
        
        System.out.println(cont);
        
    }
}