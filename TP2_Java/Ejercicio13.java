public class Ejercicio13 {
    public static void imprimirRecursivo(double[] arr, int i) {
        if (i < arr.length) {
            System.out.println("Precio: $" + arr[i]);
            imprimirRecursivo(arr, i + 1);
        }
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }
}
