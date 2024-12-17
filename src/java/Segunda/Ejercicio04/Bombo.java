package Segunda.Ejercicio04;

public class Bombo {

    int bolas[];
    int sacadas = 0;
    int tabla[][] = new int[6][8];

    public void mostrar() {
        for (int i = 0; i < bolas.length-1; i++) {
            int randomNum = (int) (Math.random() * (bolas.length - sacadas - 1) + 1);
            int num = bolas[randomNum];

            bolas[randomNum] = bolas[bolas.length - sacadas - 1];

            int fila = sacadas / 6;
            int columna = sacadas % 8;

            tabla[fila][columna] = num;
            
            System.out.println(tabla[fila][columna]);
            sacadas++;

        }

    }

    public Bombo(int numBolas) {
        this.bolas = new int[numBolas];

        for (int i = 0; i < numBolas; i++) {
            this.bolas[i] = i;
        }
    }

}
