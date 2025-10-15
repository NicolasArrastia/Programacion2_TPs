package TP5_Java;

public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Laura", "laura@example.com");
        FirmaDigital firma = new FirmaDigital("HASH123", "2025-01-01", u);
        Documento doc = new Documento("Contrato", "Contenido importante", firma);

        System.out.println(doc);
        System.out.println(firma);
        System.out.println(u);
    }
}

class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma){
        this.titulo = titulo; this.contenido = contenido; this.firma = firma;
    }
    @Override public String toString(){ return "Documento[" + titulo + "]"; }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario){ this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario; }
    @Override public String toString(){ return "FirmaDigital[" + codigoHash + "]"; }
}

class Usuario {
    private String nombre;
    private String email;
    public Usuario(String nombre, String email){ this.nombre = nombre; this.email = email; }
    @Override public String toString(){ return "Usuario[" + nombre + "]"; }
}
