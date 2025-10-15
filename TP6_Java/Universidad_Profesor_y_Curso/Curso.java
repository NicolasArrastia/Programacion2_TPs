package TP6_Java.Universidad_Profesor_y_Curso;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Si ya tiene profesor, lo eliminamos de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
        // Agregamos el curso al nuevo profesor si no estaba
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.toString() : "Sin asignar";
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Profesor: " + nombreProfesor);
    }
}
