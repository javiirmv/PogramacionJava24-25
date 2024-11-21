package Primera;

public class Ejercicio094_2 {

    public static void main(String[] args) {
        int hora = 16;
        int resultado = cuquear(hora);

        System.out.println("Campanadas totales hasta la hora " + hora + ": " + resultado);
    }

    public static int cuquear(int num1) {
        int campanadas = 0;
        while (num1 >= 1) {
            if (num1 >= 13) {
                campanadas += (num1 - 12);
            } else {
                campanadas += num1;
            }
            num1--;
        }
        return campanadas;

    }
}
