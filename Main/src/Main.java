import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();

        System.out.println("Bienvenido al programa de cuentas bancarias");

        // Pedir datos para crear cuenta
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo inicial de la cuenta:");
        double saldoInicial = scanner.nextDouble();

        // Crear cuenta con los datos ingresados
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoInicial);

        // Mostrar menú de opciones al usuario
        int opcion = 0;
        while (opcion != 6) {
            System.out.println();
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Realizar extracción rápida");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double saldoActual = servicio.consultarSaldo(cuenta);
                    System.out.println("El saldo actual de la cuenta es: " + saldoActual);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidadDeposito = scanner.nextDouble();
                    servicio.ingresar(cuenta, cantidadDeposito);
                    System.out.println("El depósito se ha realizado exitosamente");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double cantidadRetiro = scanner.nextDouble();
                    servicio.retirar(cuenta, cantidadRetiro);
                    System.out.println("El retiro se ha realizado exitosamente");
                    break;
                case 4:
    if (cuenta.getSaldoActual() == 0) {
        System.out.println("No se puede realizar la extracción rápida. El saldo actual es cero.");
    } else {
        servicio.extraccionRapida(cuenta);
        System.out.println("Se ha realizado una extracción rápida");
    }
    break;

                case 5:
                    servicio.consultarDatos(cuenta);
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        }
    }
}
