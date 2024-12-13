package Segunda.Ejercicio03;

public class Ejecutable {

    public static void main(String[] args) throws Exception {

        Nif persona1, persona2;

        persona1 = new Nif(26282131);

        try {
            persona2 = new Nif(26282131, 'T');
            persona2.Mostrar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        persona1.Mostrar();

    }
}
