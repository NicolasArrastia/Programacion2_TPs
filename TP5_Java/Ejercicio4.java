package TP5_Java;

public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco("BancoX", "20-99999999-9");
        Cliente cliente = new Cliente("Lucia", "33445566");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4000123412341234", "2026-12", banco);

        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        System.out.println(tarjeta);
        System.out.println(cliente);
        System.out.println(banco);
    }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }
    public void setCliente(Cliente c){ this.cliente = c; }
    @Override public String toString(){ return "Tarjeta[" + numero + ", vence=" + fechaVencimiento + "]"; }
}

class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;
    public Cliente(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setTarjeta(TarjetaDeCredito t){ this.tarjeta = t; }
    @Override public String toString(){ return "Cliente[" + nombre + "]"; }
}

class Banco {
    private String nombre;
    private String cuit;
    public Banco(String nombre, String cuit){ this.nombre = nombre; this.cuit = cuit; }
    @Override public String toString(){ return "Banco[" + nombre + "]"; }
}
