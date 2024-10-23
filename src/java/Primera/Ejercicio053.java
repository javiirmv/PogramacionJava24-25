package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio053 {

    public static void main(String arg[]) {

        int salarios[][] = {
            {700, 900, 1300, 800, 790, 850},
            {1000, 950, 1080, 1070, 1200, 1100},
            {1300, 930, 1200, 1170, 1000, 1000},
            {1500, 1950, 1880, 1978, 2200, 2100}};

        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Palazon", "Mario"};

        for (int i = 0; i < salarios.length; i++) {
            sumarMes(salarios[i], empleados[i]);
        }

    }

    public static void sumarMes(int salario[], String empleado) {
        int acum = 0;
        for (int i = 0; i < salario.length; i++) {
            acum += salario[i];
        }
        System.out.printf("%s ha ganado %d en total\n",empleado, acum);
    }

}
