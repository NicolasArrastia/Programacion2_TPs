import java.util.Scanner;

public class Ejercicio8 {
    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese impuesto (%): ");
        double imp = sc.nextDouble() / 100;
        System.out.print("Ingrese descuento (%): ");
        double desc = sc.nextDouble() / 100;

        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + total);
    }
}
