import Entidades.Cafetera;
import Servicios.CafeteraServicio;        
import java.util.Scanner;


public class Nespresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creamos una cafetera con capacidad máxima de 2000 ml
        Cafetera cafetera = new Cafetera(2000,0);
        
        // Creamos un servicio de cafetera
        CafeteraServicio servicio = new CafeteraServicio();
        
        // Menú principal
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad de café para llenar la cafetera: ");
                    int cantidadLlenado = scanner.nextInt();
                    if (cantidadLlenado > cafetera.getCapacidadMaxima()) {
                        System.out.println("No se puede llenar la cafetera con más de " + cafetera.getCapacidadMaxima() + " ml.");
                    } else {
                        servicio.llenarCafetera(cafetera, cantidadLlenado);
                        System.out.println("Cafetera llena con " + cafetera.getCantidadActual() + " ml.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese tamaño de la taza: ");
                    int tamanoTaza = scanner.nextInt();
                    servicio.servirTaza(cafetera, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    System.out.println("Cafetera vaciada.");
                    break;
                case 4:
                    System.out.print("Ingrese cantidad de café a agregar: ");
                    int cantidadCafe = scanner.nextInt();
                    servicio.agregarCafe(cafetera, cantidadCafe);
                    System.out.println("Café agregado a la cafetera.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            
            System.out.println();
        }
    }
}
