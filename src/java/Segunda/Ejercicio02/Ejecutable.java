package Segunda.Ejercicio02;

public class Ejecutable {

    public static void main(String[] args) {

        Perro animal1;
        Pato animal2;

        animal1 = new Perro("Dálmata", false, 1, "24-11-2024", true, "Pepe");
        animal2 = new Pato(5, 1, "24-11-2024", true, "Pepe");

        animal1.habla();
        animal2.habla();

    }
}
