import java.util.Scanner;

public class RS232 {
    public static void main(String[] args) {
        int correctas = 0;
        int incorrectas = 0;
        String input = "";

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ingrese una cadena (FDE para finalizar): ");
                input = scanner.nextLine();
                if (input.equals("&&&&&")) {
                    break;
                }
                if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }
        }

        System.out.println("\n--- Informe ---");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}
