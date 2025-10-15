package TP5_Java;

public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mariana", "m@e.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("valorQR", usuario);
    }
}

class CodigoQR {
    String valor;
    public CodigoQR(String valor){ this.valor = valor; }
    @Override public String toString(){ return "CodigoQR[" + valor + "]"; }
}

class Usuario {
    String nombre;
    String email;
    public Usuario(String nombre, String email){ this.nombre = nombre; this.email = email; }
}

class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR code = new CodigoQR(valor);
        System.out.println("Generado " + code + " para " + usuario.nombre);
    }
}
