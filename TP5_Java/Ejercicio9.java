package TP5_Java;

public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente pac = new Paciente("Mario", "OS123");
        Profesional prof = new Profesional("Dra. Ruiz", "Pediatria");
        CitaMedica cita = new CitaMedica("2025-11-01", "09:00", pac, prof);

        System.out.println(cita);
        System.out.println(pac);
        System.out.println(prof);
    }
}

class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional){
        this.fecha = fecha; this.hora = hora; this.paciente = paciente; this.profesional = profesional;
    }
    @Override public String toString(){ return "CitaMedica[" + fecha + " " + hora + "]"; }
}

class Paciente {
    String nombre;
    String obraSocial;
    public Paciente(String nombre, String obraSocial){ this.nombre = nombre; this.obraSocial = obraSocial; }
    @Override public String toString(){ return "Paciente[" + nombre + "]"; }
}

class Profesional {
    String nombre;
    String especialidad;
    public Profesional(String nombre, String especialidad){ this.nombre = nombre; this.especialidad = especialidad; }
    @Override public String toString(){ return "Profesional[" + nombre + "]"; }
}
