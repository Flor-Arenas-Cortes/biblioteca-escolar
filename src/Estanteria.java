public class Estanteria {
    
    //Clase para mejorar libros en el esatnte fijo (arreglo)
    private String[] libros;

    public Estanteria(int tamaño) {
        libros = new String[tamaño];
    }

    public void agregarLibro(int posicion, String libro) {
        if (posicion >= 0 && posicion < libros.length) {
            libros[posicion] = libro;
        } else {
            System.out.println("Posición inválida");
        }
    }

    public void mostrarEstante() {
        System.out.println("\n📚 Estante de Libros de Fantasía:");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("[" + i + "] " + libros[i]);
        }
    }
}