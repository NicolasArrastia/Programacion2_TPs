package TP3_Java;

class Estudiante {
  String nombre;
  String apellido;
  String curso;
  double calificacion;

  public void mostrarInfo() {
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
      System.out.println("Curso: " + curso);
      System.out.println("Calificación: " + calificacion);
  }

  public void subirCalificacion(double puntos) {
      calificacion += puntos;
  }

  public void bajarCalificacion(double puntos) {
      calificacion -= puntos;
  }

}

public class Ejercicio1 {

    public static void main(String[] args) {
        // Instanciar estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Juan";
        estudiante.apellido = "Pérez";
        estudiante.curso = "Programación II";
        estudiante.calificacion = 7.5;

        // Mostrar información inicial
        estudiante.mostrarInfo();

        // Subir calificación
        estudiante.subirCalificacion(1.5);
        estudiante.mostrarInfo();

        // Bajar calificación
        estudiante.bajarCalificacion(2.0);
        estudiante.mostrarInfo();
    }

}
