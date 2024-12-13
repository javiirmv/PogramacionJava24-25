
package Segunda.Ejercicio02;

public class Pato extends Animal {
    double tamanyoPico;

    public Pato(int tamanyoPico, int ID, String fnac, boolean vacunado, String nombre) {
        super(ID, fnac, vacunado, nombre);
        this.tamanyoPico = tamanyoPico;
    }

    void habla() {
        System.out.printf("Cuak, cuak, soy un pato y me mide el pico %.2f\n",tamanyoPico);
    }
    

}
