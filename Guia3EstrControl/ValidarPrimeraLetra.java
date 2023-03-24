import java.util.Scanner;

public class ValidarPrimeraLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra:");
        String palabra = sc.nextLine();

        if (palabra.charAt(0) == 'A') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

        sc.close();
    }

}
