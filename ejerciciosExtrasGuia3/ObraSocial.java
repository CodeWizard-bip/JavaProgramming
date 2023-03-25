import java.util.Scanner;

public class ObraSocial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tipoSocio;
        double costoTratamiento, descuento, importeAPagar;

        System.out.print("Ingrese la letra correspondiente al tipo de socio (A, B o C): ");
        tipoSocio = input.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        costoTratamiento = input.nextDouble();

        switch (tipoSocio) {
            case 'A':
                descuento = costoTratamiento * 0.5;
                break;
            case 'B':
                descuento = costoTratamiento * 0.35;
                break;
            case 'C':
                descuento = 0;
                break;
            default:
                System.out.println("Tipo de socio inválido.");
                return;
        }

        importeAPagar = costoTratamiento - descuento;
        System.out.println("Importe a pagar: $" + importeAPagar);
    }
}
