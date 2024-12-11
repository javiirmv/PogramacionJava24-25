package Segunda.Ejercicio01;

public class Casa {

    private String direccion; //Encapsulamiento (Protegido)
    private double numMetros;
    private String material;
    private int numHabitaciones;

    public Casa(String direccion, double nM, String material, int nH) {
        this.direccion = direccion;
        this.numMetros = nM;
        this.material = material;
        this.numHabitaciones = nH;
    }

    public Casa(String direccion, double nM, String material) {
        this.direccion = direccion;
        this.numMetros = nM;
        this.material = material;
        this.numHabitaciones = 1;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String newDireccion) {
        direccion = newDireccion;
    }

    public double getNumMetros() {
        return numMetros;
    }

    public void setNumMetros(double newNumMetros) {
        numMetros = newNumMetros;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void mostrar() {

        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Numero de habitaciones: " + this.getNumHabitaciones());
        System.out.println("Numero de metros cuadrados: " + this.numMetros);

    }

}
