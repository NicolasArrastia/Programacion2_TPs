package TP6_Java.Biblioteca_y_Libros;

public class Main {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Central");

        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "George Orwell", "Británico");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "1984", 1949, autor3);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la cámara secreta", 1998, autor2);
        biblioteca.agregarLibro("ISBN005", "El otoño del patriarca", 1975, autor1);

        // 4. Listar libros
        System.out.println("\n--- Lista de libros ---");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN y mostrar info
        System.out.println("\n--- Buscar libro por ISBN 'ISBN003' ---");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) libroBuscado.mostrarInfo();

        // 6. Filtrar libros por año
        System.out.println("\n--- Libros publicados en 1998 ---");
        biblioteca.filtrarLibrosPorAnio(1998);

        // 7. Eliminar libro por ISBN
        System.out.println("\n--- Eliminar libro con ISBN 'ISBN005' y listar nuevamente ---");
        biblioteca.eliminarLibro("ISBN005");
        biblioteca.listarLibros();

        // 8. Cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        System.out.println("\n--- Autores disponibles ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}
