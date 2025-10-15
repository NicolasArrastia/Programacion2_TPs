package TP5_Java;

public class Ejercicio1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Perez", "12345678");
        Pasaporte pasaporte = new Pasaporte("AA12345", "2024-01-01", titular); // composición crea Foto internamente
        titular.setPasaporte(pasaporte);

        System.out.println(pasaporte);
        System.out.println(titular);
    }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto("imagenBinaria", "jpg");
        this.titular = titular;
    }

    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "Pasaporte[num=" + numero + ", fecha=" + fechaEmision + ", foto=" + foto + "]";
    }
}

class Foto {
    private String imagen;
    private String formato;
    public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
    @Override public String toString(){ return "Foto[" + formato + "]"; }
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setPasaporte(Pasaporte p){ this.pasaporte = p; }
    @Override public String toString(){ return "Titular[" + nombre + ", dni=" + dni + "]"; }
}
