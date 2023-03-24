import java.util.Scanner;

public class TestOperacion {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();

        double resultadoSuma = op.sumar();
        System.out.println("La suma de los numeros es: " + resultadoSuma);

        double resultadoResta = op.restar();
        System.out.println("La resta de los numeros es: " + resultadoResta);

        double resultadoMultiplicacion = op.multiplicar();
        if (resultadoMultiplicacion == 0) {
            System.out.println("No se puede multiplicar por cero");
        } else {
            System.out.println("La multiplicacion de los numeros es: " + resultadoMultiplicacion);
        }

        double resultadoDivision = op.dividir();
        if (resultadoDivision == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("La division de los numeros es: " + resultadoDivision);
        }
    }
}
