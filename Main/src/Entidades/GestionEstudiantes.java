
package Entidades;

import Servicios.Estudiante;


public class GestionEstudiantes {
    private Estudiante[] estudiantes;

    public GestionEstudiantes() {
        this.estudiantes = new Estudiante[8];
        this.estudiantes[0] = new Estudiante("Juan", 7.5);
        this.estudiantes[1] = new Estudiante("Pedro", 5.2);
        this.estudiantes[2] = new Estudiante("María", 8.3);
        this.estudiantes[3] = new Estudiante("Ana", 6.8);
        this.estudiantes[4] = new Estudiante("Lucas", 9.0);
        this.estudiantes[5] = new Estudiante("Marta", 7.1);
        this.estudiantes[6] = new Estudiante("Jorge", 4.9);
        this.estudiantes[7] = new Estudiante("Carla", 8.8);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getNota();
        }
        return suma / estudiantes.length;
    }

    public String[] obtenerEstudiantesConNotaMayorAlPromedio() {
        double promedio = calcularPromedio();
        int cantidad = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                cantidad++;
            }
        }
        String[] nombres = new String[cantidad];
        int indice = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                nombres[indice] = e.getNombre();
                indice++;
            }
        }
        return nombres;
    }

    public Estudiante[] obtenerEstudiantesConNotaMayorAlPromedioObjetos() {
        double promedio = calcularPromedio();
        int cantidad = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                cantidad++;
            }
        }
        Estudiante[] estudiantesConNotaMayor = new Estudiante[cantidad];
        int indice = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                estudiantesConNotaMayor[indice] = e;
                indice++;
            }
        }
        return estudiantesConNotaMayor;
    }
}
