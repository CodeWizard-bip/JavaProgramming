import java.util.Scanner;
import Servicios.ParDeNumerosService;
import Entidades.ParDeNumeros;

public class ProgramaParDeNumeros {
    public static void main(String[] args) {
        
    try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        
        ParDeNumeros par = new ParDeNumeros(num1, num2);
        ParDeNumerosService servicio = new ParDeNumerosService(par);
        
        servicio.mostrarValores();
        System.out.println("El número mayor es: " + servicio.devolverMayor());
        System.out.println("La potencia del número mayor elevado al número menor es: " + servicio.calcularPotencia());
        System.out.println("La raíz cuadrada del número menor es: " + servicio.calcularRaiz(par));

        
        sc.close();
        }
    }
}
