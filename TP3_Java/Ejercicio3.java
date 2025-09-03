package TP3_Java;

class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }

    public void setAñoPublicacion(int año) {
        if (año > 0) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + añoPublicacion);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Java Básico");
        libro.setAutor("María López");
        libro.setAñoPublicacion(-2025); // inválido
        libro.setAñoPublicacion(2025);  // válido
        libro.mostrarInfo();
    }
}
