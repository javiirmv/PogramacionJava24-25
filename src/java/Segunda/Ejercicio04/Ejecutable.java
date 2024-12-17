package Segunda.Ejercicio04;

public class Ejecutable {

    public static final int FILAS = 6;
    public static final int COLUMNAS = 8;

    public static void main(String[] args) throws Exception {
        Bombo bombo1;
        bombo1 = new Bombo();

        int resultados[][] = new int[FILAS][COLUMNAS];

        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                resultados[i][j] = bombo1.sacaBola();
            }
        }

        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.print(resultados[i][j] + " ");
            }
            System.out.println();
        }
    }
}
