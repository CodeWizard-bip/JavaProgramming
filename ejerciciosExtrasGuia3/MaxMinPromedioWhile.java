import java.util.Scanner;

public class MaxMinPromedioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double num, sum = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextDouble();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
        }

        double promedio = sum / n;

        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
