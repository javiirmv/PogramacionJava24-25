package Primera;

public class Ejercicio094 {

    public static void main(String[] args) {
        int hora = 16;
        int resultado = cuquear(hora);

        System.out.println("Campanadas totales hasta la hora " + hora + ": " + resultado);
    }

    public static int cuquear(int num1) {
        if (num1 == 1) {
            return 1; 
        } else if (num1 >= 13) {
            return cuquear(num1 - 1) + (num1 - 12); 
        } else {
            return num1 + cuquear(num1 - 1); 
        }
    }
}
