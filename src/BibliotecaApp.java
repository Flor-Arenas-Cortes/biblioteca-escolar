import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Estanteria estanteria = new Estanteria(5);
        NuevosLibros nuevos = new NuevosLibros();
        Prestamos prestamos = new Prestamos();
        Devoluciones devoluciones = new Devoluciones();
        FilaEstudiantes fila = new FilaEstudiantes();

        int opcion;
        do {
            System.out.println("\n===== 📚 Biblioteca Escolar =====");
            System.out.println("1. 📖 Ver estante de libros");
            System.out.println("2. 📖 Agregar libro nuevo");
            System.out.println("3. 📖 Mostrar libros nuevos");
            System.out.println("4. 📖 Registrar préstamo");
            System.out.println("5. 📖 Ver préstamos del día");
            System.out.println("6. 📖 Devolver libro (a pila)");
            System.out.println("7. 📖 Atender estudiante en fila");
            System.out.println("8. 📖 Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> estanteria.mostrarEstante();
                case 2 -> {
                    System.out.print("Nombre del libro nuevo: ");
                    String libroNuevo = sc.nextLine();
                    nuevos.agregar(libroNuevo);
                }
                case 3 -> nuevos.mostrar();
                case 4 -> {
                    System.out.print("Nombre del libro a prestar: ");
                    String prestamo = sc.nextLine();
                    prestamos.registrar(prestamo);
                }
                case 5 -> prestamos.mostrar();
                case 6 -> {
                    System.out.print("Nombre del libro devuelto: ");
                    String devolucion = sc.nextLine();
                    devoluciones.devolver(devolucion);
                }
                case 7 -> {
                    System.out.print("Nombre del estudiante: ");
                    String estudiante = sc.nextLine();
                    fila.agregar(estudiante);
                    fila.atender();
                }
                case 8 -> System.out.println("¡Gracias por usar la Biblioteca Escolar!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 8);

        sc.close();
    }
}
