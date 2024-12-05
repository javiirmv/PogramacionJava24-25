package Segunda.Ejercicio01;

public class Casa {

    String direccion;
    double numMetros;
    String material;
    int numHabitaciones;

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

    public double setNumMetros() {
        return numMetros;
    }

    public void setNumMetros(double newNumMetros) {
        numMetros = newNumMetros;
    }
}
