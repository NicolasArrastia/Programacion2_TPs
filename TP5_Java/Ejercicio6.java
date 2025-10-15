package TP5_Java;

public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sofia", "11223344", "153000000");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-20", "20:00", cliente, mesa);

        System.out.println(reserva);
        System.out.println(cliente);
        System.out.println(mesa);
    }
}

class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa){
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }
    @Override public String toString(){ return "Reserva[" + fecha + " " + hora + "]"; }
}

class Cliente {
    String nombre;
    String telefono;
    public Cliente(String nombre, String dni, String telefono){ this.nombre = nombre; this.telefono = telefono; }
    @Override public String toString(){ return "Cliente[" + nombre + "]"; }
}

class Mesa {
    int numero;
    int capacidad;
    public Mesa(int numero, int capacidad){ this.numero = numero; this.capacidad = capacidad; }
    @Override public String toString(){ return "Mesa[" + numero + ", cap=" + capacidad + "]"; }
}
