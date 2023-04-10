import Entidades.NIF;
import Servicios.NIFService;
import java.util.Scanner;

public class DigitoVerificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NIFService nifService = new NIFService();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear NIF");
            System.out.println("2. Mostrar NIF");
            System.out.println("3. Salir");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    nifService.crearNIF();
                    break;
                case 2:
                    System.out.print("Introduce el número de DNI: ");
                    long dni = scanner.nextLong();
                    NIF nif = new NIF(dni);
                    nifService.mostrar(nif);
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}
