import java.util.Scanner;

public class JuegoAdivinarMultiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11); // Generar primer número aleatorio
        int num2 = (int) (Math.random() * 11); // Generar segundo número aleatorio
        int resultado = num1 * num2; // Calcular el resultado de la multiplicación
        int respuestaUsuario;
        do {
            System.out.print("Adivine el resultado de la multiplicación de " + num1 + " y " + num2 + ": ");
            respuestaUsuario = sc.nextInt(); // Leer respuesta del usuario
            if (respuestaUsuario == resultado) {
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta, inténtelo de nuevo.");
            }
        } while (respuestaUsuario != resultado);
        sc.close();
    }
}
