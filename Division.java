import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa primer número: ");
        int a = input.nextInt();

        System.out.print("Ingresa segundo número: ");
        int b = input.nextInt();

        System.out.println("División entera: " + (a / b));
        System.out.println("División con decimales: " + ((double)a / b));
    }
}
