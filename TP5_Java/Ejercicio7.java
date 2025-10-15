package TP5_Java;

public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "MTR123");
        Conductor conductor = new Conductor("Pedro", "LIC1234");
        Vehiculo veh = new Vehiculo("ABC123", "ModeloX", motor);
        veh.setConductor(conductor);
        conductor.setVehiculo(veh);

        System.out.println(veh);
        System.out.println(motor);
        System.out.println(conductor);
    }
}

class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor){ this.patente = patente; this.modelo = modelo; this.motor = motor; }
    public void setConductor(Conductor c){ this.conductor = c; }
    @Override public String toString(){ return "Vehiculo[" + patente + ", " + modelo + "]"; }
}

class Motor {
    private String tipo;
    private String numeroSerie;
    public Motor(String tipo, String numeroSerie){ this.tipo = tipo; this.numeroSerie = numeroSerie; }
    @Override public String toString(){ return "Motor[" + tipo + ", sn=" + numeroSerie + "]"; }
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia){ this.nombre = nombre; this.licencia = licencia; }
    public void setVehiculo(Vehiculo v){ this.vehiculo = v; }
    @Override public String toString(){ return "Conductor[" + nombre + "]"; }
}
