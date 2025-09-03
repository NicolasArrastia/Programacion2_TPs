package TP3_Java;

class Mascota {
  String nombre;
  String especie;
  int edad;

  public void mostrarInfo() {
      System.out.println(nombre + " (" + especie + "), Edad: " + edad);
  }

  public void cumplirAnios() {
      edad++;
  }
}

public class Ejercicio2 {

  public static void main(String[] args) {
      Mascota m = new Mascota();
      m.nombre = "Firulais";
      m.especie = "Perro";
      m.edad = 3;

      m.mostrarInfo();
      m.cumplirAnios();
      m.mostrarInfo();
  }
}
