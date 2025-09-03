package TP3_Java;

class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() { huevosPuestos++; }
    public void envejecer() { edad++; }
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + ", Huevos puestos: " + huevosPuestos);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Gallina gallina_1 = new Gallina();
        gallina_1.idGallina = 1;
        gallina_1.edad = 2;
        gallina_1.huevosPuestos = 0;

        Gallina gallina_2 = new Gallina();
        gallina_2.idGallina = 2;
        gallina_2.edad = 1;
        gallina_2.huevosPuestos = 0;

        gallina_1.ponerHuevo();
        gallina_1.envejecer();
        gallina_2.ponerHuevo();
        gallina_2.ponerHuevo();
        gallina_2.envejecer();

        gallina_1.mostrarEstado();
        gallina_2.mostrarEstado();
    }
}
