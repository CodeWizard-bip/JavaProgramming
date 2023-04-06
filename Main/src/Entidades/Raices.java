package Entidades;

public class Raices {
    private final double a;
    private final double b;
    private final double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular el discriminante de la ecuación
    public double getDiscriminante() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    // Método para verificar si la ecuación tiene dos soluciones
    public boolean tieneRaices() {
        return this.getDiscriminante() >= 0;
    }

    // Método para verificar si la ecuación tiene una única solución
    public boolean tieneRaiz() {
        return this.getDiscriminante() == 0;
    }

    // Método para obtener las dos soluciones de la ecuación
    public void obtenerRaices() {
        if (this.tieneRaices()) {
            double x1 = (-this.b + Math.sqrt(this.getDiscriminante())) / (2 * this.a);
            double x2 = (-this.b - Math.sqrt(this.getDiscriminante())) / (2 * this.a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Método para obtener la única solución de la ecuación
    public void obtenerRaiz() {
        if (this.tieneRaiz()) {
            double x = -this.b / (2 * this.a);
            System.out.println("La única solución es: x = " + x);
        }
    }

    // Método para calcular las soluciones de la ecuación
    public void calcular() {
        if (this.tieneRaices()) {
            this.obtenerRaices();
        } else if (this.tieneRaiz()) {
            this.obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}