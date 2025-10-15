package TP6_Java.Sistema_de_Stock;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear productos
        Producto p1 = new Producto("P001", "Leche", 1200, 10, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Remera", 1500, 5, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P003", "Laptop", 2500, 3, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("P004", "Silla", 3000, 7, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 500, 20, CategoriaProducto.ALIMENTOS);

        // 1. Agregar productos
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Lista productos
        System.out.println("=== Listado de productos ===");
        inventario.listarProductos();

        // 3. Buscar por ID
        System.out.println("\n=== Buscar producto por ID: P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n=== Filtrar por categoría ALIMENTOS ===");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }


        // 5. Eliminar por ID y listar productos
        System.out.println("\n=== Eliminar producto por ID: P002 ===");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // 7. Mostrar total de stock
        System.out.println("\n=== Total de stock disponible ===");
        System.out.println(inventario.obtenerTotalStock());

        // 6. Actualizar stock de un producto
        System.out.println("\n=== Actualizar stock del producto P001 a 15 ===");
        inventario.actualizarStock("P001", 15);
        inventario.listarProductos();

        // 8. Producto con mayor stock
        System.out.println("\n=== Producto con mayor stock ===");
        System.out.println(inventario.obtenerProductoConMayorStock());

        // 9. Filtrar productos por rango de precio
        System.out.println("\n=== Filtrar productos por precio ($1000-$3000) ===");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorías disponibles
        System.out.println("\n=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
