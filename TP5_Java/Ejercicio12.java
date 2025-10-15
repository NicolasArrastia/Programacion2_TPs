package TP5_Java;

public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("EmpresaX", "20-11111111-1");
        Impuesto imp = new Impuesto(1500.0);
        Calculadora calc = new Calculadora();
        calc.calcular(imp);
    }
}

class Impuesto {
    double monto;
    public Impuesto(double monto){ this.monto = monto; }
}

class Contribuyente {
    String nombre;
    String cuil;
    public Contribuyente(String nombre, String cuil){ this.nombre = nombre; this.cuil = cuil; }
}

class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.println("Calculando impuesto de: " + impuesto.monto);
    }
}
