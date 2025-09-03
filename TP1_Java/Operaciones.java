import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingresa segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));

        input.close();
    }
}
