import java.util.Scanner;

public class MultiplosCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, cantidadNumeros = 0, cantidadPares = 0, cantidadImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            numero = sc.nextInt();
            if (numero % 5 == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            cantidadNumeros++;
            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
