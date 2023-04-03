
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera, int cantidadLlenado) {
    int capacidadMaxima = cafetera.getCapacidadMaxima();
    int cantidadActual = cafetera.getCantidadActual();
    if (cantidadLlenado > capacidadMaxima) {
        System.out.println("No se puede llenar la cafetera con esa cantidad, sobrepasa la capacidad máxima.");
        return;
    }
    if (cantidadActual + cantidadLlenado > capacidadMaxima) {
        System.out.println("No se puede llenar la cafetera con esa cantidad, sobrepasa la capacidad máxima.");
        return;
    }
    cafetera.setCantidadActual(cantidadActual + cantidadLlenado);
}


    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha servido la taza de " + tamanoTaza + " ml.");
        } else {
            System.out.println("No se ha podido servir la taza completa, se ha servido " + cafetera.getCantidadActual() + " ml.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

   public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        System.out.print("Ingrese la cantidad de café a agregar: ");
        int cantidad = leer.nextInt();
        if (cafetera.getCantidadActual() + cantidad <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
            System.out.println("Se ha agregado " + cantidad + " ml de café a la cafetera.");
        } else {
            int cantidadMaxima = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se ha llenado la cafetera con " + cantidadMaxima + " ml de café, no se pudo agregar " + (cantidad - cantidadMaxima) + " ml.");
        }
    }
}
