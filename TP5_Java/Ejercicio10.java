package TP5_Java;

public class Ejercicio10 {
    public static void main(String[] args) {
        Titular t = new Titular("Diego", "99887766");
        ClaveSeguridad clave = new ClaveSeguridad("0000", "2025-01-01", t); // agregación Clave -> Titular
        CuentaBancaria cuenta = new CuentaBancaria("CBU0001", 10000.0, clave, t); // composición Cuenta -> Clave
        t.setCuenta(cuenta);

        System.out.println(cuenta);
        System.out.println(clave);
        System.out.println(t);
    }
}

class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular){
        this.cbu = cbu; this.saldo = saldo; this.clave = clave; this.titular = titular;
    }
    @Override public String toString(){ return "CuentaBancaria[" + cbu + ", saldo=" + saldo + "]"; }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    private Titular titular;

    public ClaveSeguridad(String codigo, String ultimaModificacion, Titular titular){
        this.codigo = codigo; this.ultimaModificacion = ultimaModificacion; this.titular = titular;
    }
    @Override public String toString(){ return "ClaveSeguridad[" + codigo + "]"; }
}

class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public Titular(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setCuenta(CuentaBancaria c){ this.cuenta = c; }
    @Override public String toString(){ return "Titular[" + nombre + "]"; }
}
