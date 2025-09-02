import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0) suma += num;
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}
