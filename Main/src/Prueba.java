import Servicios.Estudiante;

import Entidades.GestionEstudiantes;


public class Prueba {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();

        double promedio = gestion.calcularPromedio();
        System.out.println("El promedio de notas del curso es: " + promedio);

        String[] estudiantesConNotaMayor = gestion.obtenerEstudiantesConNotaMayorAlPromedio();
        System.out.println("Los estudiantes con nota mayor al promedio son:");
        System.out.println("Todos los estudiantes con nota mayor al promedio son:");
    Estudiante[] estudiantes = gestion.obtenerEstudiantesConNotaMayorAlPromedioObjetos();
    for (Estudiante estudiante : estudiantes) {
        System.out.println("Nombre: " + estudiante.getNombre() + ", Nota: " + estudiante.getNota());
    }

   }     
}
