public class BibliotecaApp {
    public static void main(String[] args) throws Exception {
        Estanteria estanteria = new Estanteria(5);

        // Pruebas de estantería
        estanteria.agregarLibro(0, "Harry Potter");
        estanteria.agregarLibro(1, "Game of thrones");
        estanteria.agregarLibro(2, "Señor de los Anillos");
        estanteria.agregarLibro(3, "El Nombre del Viento");
        estanteria.agregarLibro(4, "Alas de Sangre");
        estanteria.mostrarEstante();
    }
}
