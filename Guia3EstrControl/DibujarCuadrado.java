import java.util.Scanner;

public class DibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = sc.nextInt();

        // Dibuja la primera fila
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dibuja las filas intermedias
        for (int i = 2; i <= n - 1; i++) {
            System.out.print("* ");
            for (int j = 2; j <= n - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Dibuja la última fila
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        sc.close(); // Cerramos el objeto Scanner al final del método main.
    }
}
