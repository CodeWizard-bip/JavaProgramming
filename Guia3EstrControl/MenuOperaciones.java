import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int opcion;
        char confirmacion;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        do {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = input.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción del 1 al 5.");
                    break;
            }
        } while (true);

    }

}
