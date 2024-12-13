package Segunda.Ejercicio02;

public class Perro extends Animal {
    String raza;
    boolean peligroso;

    public Perro(String raza, boolean peligroso, int ID, String fnac, boolean vacunado, String nombre) {
        super(ID, fnac, vacunado, nombre);
        this.raza = raza;
        this.peligroso = peligroso;
    }

    
    public void habla(){
        System.out.printf("Guau, guau, soy un perro de raza %s, nací el %s y me llamo %s\n",raza, fnac, this.getNombre());
    }
    
}
