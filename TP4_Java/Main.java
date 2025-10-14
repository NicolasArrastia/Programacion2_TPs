public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "Juan Pérez", "Programador", 80000);
        Empleado e2 = new Empleado("Ana Gómez", "Analista");
        Empleado e3 = new Empleado("Luis Torres", "Tester");

        e1.actualizarSalario(10);
        e2.actualizarSalario(5000);
        e3.actualizarSalario(15);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
