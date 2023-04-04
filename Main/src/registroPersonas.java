import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;


public class registroPersonas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        PersonaServicio servicio = new PersonaServicio();
        

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingresando datos de persona " + i);
            System.out.print("Ingrese nombre de la persona: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese sexo de la persona (H, M, O): ");
            char sexo = scanner.nextLine().charAt(0);
            while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.print("Sexo ingresado incorrecto, por favor ingrese sexo válido (H, M, O): ");
                sexo = scanner.nextLine().charAt(0);
            }

            System.out.print("Ingrese peso de la persona en kg: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese altura de la persona en metros: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            Persona persona = new Persona(nombre, edad, sexo, peso, altura);
            
            int imc = servicio.calcularIMC(persona);
            System.out.println("IMC de la persona: " + imc);
            
            switch (imc) {
    case -1:
        if (!persona.esMayorDeEdad()) {
            System.out.println("La persona es menor de edad y está por debajo de su peso ideal");
        } else {
            System.out.println("La persona es mayor de edad y está por debajo de su peso ideal");
        }
        break;
    case 0:
        if (!persona.esMayorDeEdad()) {
            System.out.println("La persona es menor de edad y tiene un peso ideal");
        } else {
            System.out.println("La persona es mayor de edad y tiene un peso ideal");
        }
        break;
    case 1:
        if (!persona.esMayorDeEdad()) {
            System.out.println("La persona es menor de edad y tiene sobrepeso");
        } else {
            System.out.println("La persona es mayor de edad y tiene sobrepeso");
        }
        break;
    default:
        System.out.println("IMC no válido");
        break;
}
        }

        scanner.close();
    }
}
}