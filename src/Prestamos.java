import java.util.LinkedList;

public class Prestamos {
    private LinkedList<String> prestamos;

    public Prestamos() {
        prestamos = new LinkedList<>();
    }

    public void registrar(String libro) {
        prestamos.add(libro);
    }

    public void mostrar() {
        System.out.println("\n📋 Préstamos del día:");
        for (String libro : prestamos) {
            System.out.println("- " + libro);
        }
    }
}
