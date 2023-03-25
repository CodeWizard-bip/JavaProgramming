public class CambioDeVariables {
    public static void main(String[] args) {
        int A = 5, B = 10, C = 15, D = 20;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores finales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
}
