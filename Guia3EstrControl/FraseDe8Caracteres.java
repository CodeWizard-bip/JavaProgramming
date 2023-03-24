import java.util.Scanner;

public class FraseDe8Caracteres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra de 8 caracteres: ");
        String frase = input.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        input.close(); // Cerramos el objeto Scanner al final del programa.
    }
}
