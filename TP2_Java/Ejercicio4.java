import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = input.next().toUpperCase().charAt(0);

        double descuento = switch (cat) {
            case 'A' -> 0.10;
            case 'B' -> 0.15;
            case 'C' -> 0.20;
            default -> 0.0;
        };

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
        input.close();
    }
}
