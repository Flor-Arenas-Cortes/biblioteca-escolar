import java.util.Stack;

public class Devoluciones {
    private Stack<String> pila;

    public Devoluciones() {
        pila = new Stack<>();
    }

    public void devolver(String libro) {
        pila.push(libro);
        System.out.println("Libro \"" + libro + "\" agregado a la pila de devoluciones.");
    }
}
