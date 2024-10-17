package Primera;

public class Ejercicio048 {

    public static void main(String arg[]) {

        int salarios[][] = {
            {700, 900, 1300, 800, 790, 850},
            {1000, 950, 1080, 1070, 1200, 1100},
            {1300, 930, 1200, 1170, 1000, 1000},
            {1500, 1950, 1880, 1978, 2200, 2100}};

        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Palazon", "Mario"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};

        int[] salariosMeses = sumarSalarios(salarios);

        for (int i = 0; i < salariosMeses.length; i++) {
            System.out.println(salariosMeses[i]);
        }

    }

    public static int[] sumarSalarios(int[][] vector) {
        int[] salariosAcum = new int[6];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                salariosAcum[j] += vector[i][j];
            }
        }

        return salariosAcum;
    }

}
