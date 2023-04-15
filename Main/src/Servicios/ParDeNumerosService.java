
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {
    private ParDeNumeros par;

    public ParDeNumerosService() {
        this.par = new ParDeNumeros();
    }

    public ParDeNumerosService(double numero1, double numero2) {
        this.par = new ParDeNumeros(numero1, numero2);
    }

    public void mostrarValores() {
        System.out.println("Valor 1: " + par.getNumero1());
        System.out.println("Valor 2: " + par.getNumero2());
    }

    public double devolverMayor() {
        if (par.getNumero1() > par.getNumero2()) {
            return par.getNumero1();
        } else {
            return par.getNumero2();
        }
    }

    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = mayor == par.getNumero1() ? par.getNumero2() : par.getNumero1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }

   public double calcularRaiz(ParDeNumeros par) {
    double menor = par.getNumero1() < par.getNumero2() ? par.getNumero1() : par.getNumero2();
    menor = Math.abs(menor);
    return Math.sqrt(menor);
}
    
    public ParDeNumerosService(ParDeNumeros par) {
    this.par = par;
}
}
