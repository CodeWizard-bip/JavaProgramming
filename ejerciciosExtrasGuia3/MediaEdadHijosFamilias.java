import java.util.Scanner;

public class MediaEdadHijosFamilias {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedir cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        int nFamilias = input.nextInt();

        int cantidadTotalHijos = 0;
        int sumaEdades = 0;

        // Iterar por cada familia y pedir cantidad de hijos
        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int nHijos = input.nextInt();

            // Iterar por cada hijo y pedir edad
            for (int j = 1; j <= nHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edadHijo = input.nextInt();
                sumaEdades += edadHijo;
                cantidadTotalHijos++;
            }
        }

        // Calcular la media de edad
        double mediaEdad = (double) sumaEdades / cantidadTotalHijos;

        // Mostrar la media de edad
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
