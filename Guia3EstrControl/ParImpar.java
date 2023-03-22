import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        try {
            System.out.print("Ingrese un número entero: ");
            numero = input.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        } finally {
            input.close();
        }
    }
}
