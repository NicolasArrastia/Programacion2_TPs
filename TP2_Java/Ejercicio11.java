import java.util.Scanner;

public class Ejercicio11 {
    static double descuentoGlobal = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        double finalConDescuento = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalConDescuento);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        calcularDescuentoEspecial(precio);

        input.close();
    }
}
