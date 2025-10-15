package TP5_Java;

public class Ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("The Band", "Rock");
        Cancion cancion = new Cancion("Mi tema", artista);
        Reproductor rep = new Reproductor();
        rep.reproducir(cancion);
    }
}

class Cancion {
    String titulo;
    Artista artista;
    public Cancion(String titulo, Artista artista){ this.titulo = titulo; this.artista = artista; }
    @Override public String toString(){ return "Cancion[" + titulo + "]"; }
}

class Artista {
    String nombre;
    String genero;
    public Artista(String nombre, String genero){ this.nombre = nombre; this.genero = genero; }
}

class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion);
    }
}
