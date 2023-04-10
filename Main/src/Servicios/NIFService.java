
package Servicios;

import java.util.Scanner;
import Entidades.NIF;
public class NIFService {
    private final Scanner scanner;

    public NIFService() {
        scanner = new Scanner(System.in);
    }

    public void crearNIF() {
        System.out.print("Introduce el número de DNI: ");
        long dni = scanner.nextLong();
        NIF nif = new NIF(dni);
        System.out.println("El NIF correspondiente es: " + nif.mostrar());
    }

    public void mostrar(NIF nif) {
        System.out.println("El NIF correspondiente es: " + nif.mostrar());
    }
}
