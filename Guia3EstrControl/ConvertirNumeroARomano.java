import java.util.Scanner;

public class ConvertirNumeroARomano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número entre 1 y 10: ");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("El número " + num + " en romano es I");
                break;
            case 2:
                System.out.println("El número " + num + " en romano es II");
                break;
            case 3:
                System.out.println("El número " + num + " en romano es III");
                break;
            case 4:
                System.out.println("El número " + num + " en romano es IV");
                break;
            case 5:
                System.out.println("El número " + num + " en romano es V");
                break;
            case 6:
                System.out.println("El número " + num + " en romano es VI");
                break;
            case 7:
                System.out.println("El número " + num + " en romano es VII");
                break;
            case 8:
                System.out.println("El número " + num + " en romano es VIII");
                break;
            case 9:
                System.out.println("El número " + num + " en romano es IX");
                break;
            case 10:
                System.out.println("El número " + num + " en romano es X");
                break;
            default:
                System.out.println("El número ingresado no está entre 1 y 10");
                break;
        }

        sc.close();
    }
}
