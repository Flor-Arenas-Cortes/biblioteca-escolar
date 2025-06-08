import java.util.LinkedList;
import java.util.Queue;

public class FilaEstudiantes {
    private Queue<String> fila;

    public FilaEstudiantes() {
        fila = new LinkedList<>();
    }

    public void agregar(String nombre) {
        fila.add(nombre);
        System.out.println("Estudiante \"" + nombre + "\" agregado a la fila.");
    }

    public void atender() {
        if (!fila.isEmpty()) {
            System.out.println("Atendiendo a: " + fila.remove());
        } else {
            System.out.println("No hay estudiantes en fila.");
        }
    }
}
