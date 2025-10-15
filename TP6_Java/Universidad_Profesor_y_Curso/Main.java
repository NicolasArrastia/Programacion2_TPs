package TP6_Java.Universidad_Profesor_y_Curso;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");
        
        // 1. Crear profesores
        Profesor prof1 = new Profesor("P001", "Juan Pérez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Ana Gómez", "Física");
        Profesor prof3 = new Profesor("P003", "Luis Fernández", "Programación");
        
        
        // 1. Crear cursos
        Curso curso1 = new Curso("C101", "Álgebra");
        Curso curso2 = new Curso("C102", "Física I");
        Curso curso3 = new Curso("C103", "Programación I");
        Curso curso4 = new Curso("C104", "Cálculo");
        Curso curso5 = new Curso("C105", "Bases de Datos");
        
        // 2. Agregar profesores a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        
        // 2. Agregar cursos a la universidad
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P003");

        // 4. Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n--- Cambiar profesor de C103 ---");
        uni.asignarProfesorACurso("C103", "P001");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Eliminar curso
        System.out.println("\n--- Eliminar curso C102 ---");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        uni.listarProfesores();

        // 7. Eliminar profesor
        System.out.println("\n--- Eliminar profesor P003 ---");
        uni.eliminarProfesor("P003");
        uni.listarCursos();
        uni.listarProfesores();

        // 8 Reporte cantidad de cursos por profesor
        uni.reporteCantidadCursosPorProfesor();
    }
}
