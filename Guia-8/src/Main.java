import java.util.Scanner;
import entidades.CuentaBancaria;



public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        // Crear cuenta
        servicio.crearCuenta();
        
        // Ingresar dinero
        System.out.print("Ingrese la cantidad de dinero a ingresar: ");
        double cantidad = sc.nextDouble();
        servicio.ingresar(cantidad);
        System.out.println("Saldo actual: " + servicio.consultarSaldo());
        
        // Retirar dinero
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        cantidad = sc.nextDouble();
        servicio.retirar(cantidad);
        System.out.println("Saldo actual: " + servicio.consultarSaldo());
        
        // Extracción rápida
        servicio.extraccionRapida();
        System.out.println("Saldo actual: " + servicio.consultarSaldo());
        
        // Consultar saldo y datos
        System.out.println("Saldo actual: " + servicio.consultarSaldo());
        servicio.consultarDatos();
        
        sc.close();
    } 
}
