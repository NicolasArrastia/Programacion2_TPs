import java.util.Scanner;

public class EntradaUsuario  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        input.close();
    }
}
