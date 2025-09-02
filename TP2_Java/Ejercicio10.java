import java.util.Scanner;

public class Ejercicio10 {
    public static int actualizarStock(int actual, int vendidos, int recibidos) {
        return actual - vendidos + recibidos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Stock actual: ");
        int stock = sc.nextInt();
        System.out.print("Cantidad vendida: ");
        int vendida = sc.nextInt();
        System.out.print("Cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevo = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);
    }
}
