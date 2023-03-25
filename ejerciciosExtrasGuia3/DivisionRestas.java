import java.util.Scanner;

public class DivisionRestas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        sc.close();

        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        int residuo = dividendo;

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
