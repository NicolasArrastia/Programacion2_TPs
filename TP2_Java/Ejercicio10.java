import java.util.Scanner;

public class Ejercicio10 {
    public static int actualizarStock(int actual, int vendidos, int recibidos) {
        return actual - vendidos + recibidos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Stock actual: ");
        int stock = input.nextInt();
        System.out.print("Cantidad vendida: ");
        int vendida = input.nextInt();
        System.out.print("Cantidad recibida: ");
        int recibida = input.nextInt();

        int nuevo = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);

        input.close();
    }
}
