package Segunda.Ejercicio01;

public class Ejecutable {

    public static void main(String arg[]) {
        Casa casa1, casa2;

        casa1 = new Casa("Calle Quevedo nº 52", 1000, "Ladrillo", 33);
        casa2 = new Casa("Calle de la Armargura Mayor nº 69", 1000, "Chocolate");

        System.out.println(casa1.getDireccion());
        
    }
}
