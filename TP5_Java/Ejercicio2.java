package TP5_Java;

public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria b = new Bateria("BT-100", 4000);
        Usuario u = new Usuario("Ana Gomez", "87654321");
        Celular c = new Celular("359123456789012", "MarcaX", "ModelY", b);
        c.setUsuario(u);
        u.setCelular(c);

        System.out.println(c);
        System.out.println(b);
        System.out.println(u);
    }
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    public void setUsuario(Usuario u){ this.usuario = u; }
    @Override public String toString(){ return "Celular[" + marca + " " + modelo + ", imei=" + imei + "]"; }
}

class Bateria {
    private String modelo;
    private int capacidad;
    public Bateria(String modelo, int capacidad){ this.modelo = modelo; this.capacidad = capacidad; }
    @Override public String toString(){ return "Bateria[" + modelo + ", " + capacidad + "mAh]"; }
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    public Usuario(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setCelular(Celular c){ this.celular = c; }
    @Override public String toString(){ return "Usuario[" + nombre + ", dni=" + dni + "]"; }
}
