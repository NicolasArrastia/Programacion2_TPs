package TP5_Java;

public class Ejercicio3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel Garcia", "Colombiano");
        Editorial editorial = new Editorial("EditorialX", "Calle 1");
        Libro libro = new Libro("El cuento", "ISBN1234", autor, editorial);

        System.out.println(libro);
        System.out.println(autor);
        System.out.println(editorial);
    }
}

class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
    @Override public String toString(){ return "Libro[" + titulo + ", " + isbn + "]"; }
}

class Autor {
    private String nombre;
    private String nacionalidad;
    public Autor(String nombre, String nacionalidad){ this.nombre = nombre; this.nacionalidad = nacionalidad; }
    @Override public String toString(){ return "Autor[" + nombre + "]"; }
}

class Editorial {
    private String nombre;
    private String direccion;
    public Editorial(String nombre, String direccion){ this.nombre = nombre; this.direccion = direccion; }
    @Override public String toString(){ return "Editorial[" + nombre + "]"; }
}
