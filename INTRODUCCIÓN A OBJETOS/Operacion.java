import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = input.nextDouble();
        input.close();
    }

    public double sumar() {
        return this.numero1 + this.numero2;
    }

    public double restar() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    public double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
}
