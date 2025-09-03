package TP3_Java;

class NaveEspacial {
    String nombre;
    int combustible;
    final int LIMITE_COMBUSTIBLE = 100;

    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado");
            combustible--;
        } else {
            System.out.println("No hay combustible para despegar");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            System.out.println(nombre + " avanzó " + distancia + " unidades");
            combustible -= distancia;
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado a " + combustible);
        } else {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println("Combustible lleno a " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible: " + combustible);
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Explorer 1";
        nave.combustible = 50;

        nave.avanzar(10);          // no debería avanzar suficiente
        nave.recargarCombustible(30);
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}
