import java.util.Scanner;

public class Estaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double estatura, sumaGeneral = 0, sumaBaja = 0;
        int contGeneral = 0, contBaja = 0;
        double promedioGeneral, promedioBaja;

        System.out.print("Ingrese la cantidad de personas: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            estatura = sc.nextDouble();
            sumaGeneral += estatura;
            contGeneral++;
            if (estatura < 1.6) {
                sumaBaja += estatura;
                contBaja++;
            }
        }

        if (contGeneral != 0) {
            promedioGeneral = sumaGeneral / contGeneral;
            System.out.println("Promedio de estaturas en general: " + promedioGeneral);
        } else {
            System.out.println("No se ingresaron estaturas");
        }

        if (contBaja != 0) {
            promedioBaja = sumaBaja / contBaja;
            System.out.println("Promedio de estaturas por debajo de 1.60 mts: " + promedioBaja);
        } else {
            System.out.println("No se ingresaron estaturas por debajo de 1.60 mts");
        }
    }
}
