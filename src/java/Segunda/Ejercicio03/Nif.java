package Segunda.Ejercicio03;

public class Nif {

    public int DNI;
    public char letra;

    public final char tabla[] = { //Final lo hace const
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
        'C', 'K', 'E'
    };

    public Nif(int DNI, char letra) throws Exception {
        this.DNI = DNI;

        if (letra != tabla[DNI % 23]) {
            throw new Exception("La letra del NIF no es correcta.");
        }
        
        this.letra = letra;
    }

    public Nif(int DNI) {
        this.DNI = DNI;
        this.letra = tabla[DNI % 23];
    }

    public void Mostrar() {
        System.out.println(DNI + " - " + letra);
    }

}
