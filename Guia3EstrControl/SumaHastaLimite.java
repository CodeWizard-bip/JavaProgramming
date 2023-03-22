import java.util.Scanner;

public class SumaHastaLimite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el límite positivo: ");
        int limite = sc.nextInt();

        int suma = 0;
        int numero;
        int contador = 0;

        while (suma <= limite) {
            contador++;
            System.out.print("Introduce el número " + contador + ": ");
            numero = sc.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números introducidos superó el límite inicial de " + limite);
        System.out.println("La suma total es " + suma);

        sc.close();
    }

}
