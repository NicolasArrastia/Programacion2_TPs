public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int ultimoId = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id > ultimoId) {
            ultimoId = id;
        }
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        if (id > ultimoId) {
            ultimoId = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
