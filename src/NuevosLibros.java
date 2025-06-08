import java.util.ArrayList;

public class NuevosLibros {
    private ArrayList<String> lista;

    public NuevosLibros() {
        lista = new ArrayList<>();
    }

    public void agregar(String libro) {
        lista.add(libro);
    }

    public void mostrar() {
        System.out.println("\n📖 Libros nuevos:");
        for (String libro : lista) {
            System.out.println("- " + libro);
        }
    }
}
