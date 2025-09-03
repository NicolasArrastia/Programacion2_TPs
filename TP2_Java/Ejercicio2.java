import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = input.nextInt();

        int mayor = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("El mayor es: " + mayor);

        input.close();
    }
}
