package TP5_Java;

public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("ProyectoX", 10);
        EditorVideo editor = new EditorVideo();
        editor.exportar("mp4", proyecto);
    }
}

class Render {
    String formato;
    public Render(String formato){ this.formato = formato; }
    @Override public String toString(){ return "Render[" + formato + "]"; }
}

class Proyecto {
    String nombre;
    int duracionMin;
    public Proyecto(String nombre, int duracionMin){ this.nombre = nombre; this.duracionMin = duracionMin; }
}

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato);
        System.out.println("Exportado " + proyecto.nombre + " a " + r);
    }
}
