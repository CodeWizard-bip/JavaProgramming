
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Introduce el valor de a:");
        double a = scanner.nextDouble();
        System.out.println("Introduce el valor de b:");
        double b = scanner.nextDouble();
        System.out.println("Introduce el valor de c:");
        double c = scanner.nextDouble();
        scanner.close();
        
        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();
        }
    }
}
