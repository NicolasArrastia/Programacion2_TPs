import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine(); // Cambiado de nextInt() a nextLine()
        System.out.println("Hola, " + nombre);

        input.close();
    }
}
