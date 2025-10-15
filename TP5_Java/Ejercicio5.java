package TP5_Java;

public class Ejercicio5 {
    public static void main(String[] args) {
        Propietario p = new Propietario("Martin", "44556677");
        Computadora comp = new Computadora("MarcaZ", "SN12345", p);
        System.out.println(comp);
        System.out.println(comp.getPlacaMadre());
        System.out.println(p);
    }
}

class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, Propietario propietario){
        this.marca = marca; this.numeroSerie = numeroSerie; this.propietario = propietario;
        this.placaMadre = new PlacaMadre("ModeloX", "ChipsetY");
    }
    public PlacaMadre getPlacaMadre(){ return placaMadre; }
    @Override public String toString(){ return "Computadora[" + marca + " sn=" + numeroSerie + "]"; }
}

class PlacaMadre {
    private String modelo;
    private String chipset;
    public PlacaMadre(String modelo, String chipset){ this.modelo = modelo; this.chipset = chipset; }
    @Override public String toString(){ return "PlacaMadre[" + modelo + ", " + chipset + "]"; }
}

class Propietario {
    private String nombre;
    private String dni;
    private Computadora comp;
    public Propietario(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    @Override public String toString(){ return "Propietario[" + nombre + "]"; }
    public void setComputadora(Computadora c){ this.comp = c; }
}
