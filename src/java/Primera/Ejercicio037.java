/*
/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio037 {

    public static void main(String arg[]) {

        int salarios[][] = {
            {700, 900, 1300, 800, 790, 850},
            {1000, 950, 1080, 1070, 1200, 1100},
            {1300, 930, 1200, 1170, 1000, 1000},
            {1500, 1950, 1880, 1978, 2200, 2100}};

        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Palazon", "Mario"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};

        double vEmpleadosAcum[] = {0, 0, 0, 0};
        double vMesesAcum[] = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[i].length; j++) {
                vEmpleadosAcum[i] += salarios[i][j];
                vMesesAcum[j] += salarios[i][j];

            }
        }

        int mayorPos = 0;
        int menorPos = 0;

        int mayorAsign = 0;
        int menorAsign = 0;

        for (int i = 0; i < vEmpleadosAcum.length; i++) {

            if (vEmpleadosAcum[i] > vEmpleadosAcum[mayorPos]) {
                mayorPos = i;
            }

            if (vEmpleadosAcum[i] < vEmpleadosAcum[mayorPos]) {
                menorPos = i;
            }
        }

        for (int i = 0; i < vMesesAcum.length; i++) {

            if (vMesesAcum[i] > vMesesAcum[mayorAsign]) {
                mayorAsign = i;
            }

            if (vMesesAcum[i] < vMesesAcum[mayorAsign]) {
                menorAsign = i;
            }
        }

        System.out.printf("El empleado que más cobra es %s con una media de %.2f\n", empleados[mayorPos], vEmpleadosAcum[mayorPos] / meses.length);
        System.out.printf("El empleado que menos cobra es %s con una media de %.2f\n", empleados[menorPos], vEmpleadosAcum[menorPos] / meses.length);

        System.out.printf("El mes que más se cobra es %s con una media de %.2f\n", meses[mayorAsign], vMesesAcum[mayorAsign] / empleados.length);
        System.out.printf("El mes que menos se cobra es %s con una media de %.2f\n", meses[menorAsign], vMesesAcum[menorAsign] / empleados.length);

    }
}
