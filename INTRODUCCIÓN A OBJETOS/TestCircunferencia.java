public class TestCircunferencia {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.0);
        System.out.println("Radio de c1: " + c1.getRadio());
        System.out.println("Area de c1: " + c1.area());
        System.out.println("Perimetro de c1: " + c1.perimetro());

        Circunferencia c2 = new Circunferencia(0.0);
        c2.crearCircunferencia();
        System.out.println("Radio de c2: " + c2.getRadio());
        System.out.println("Area de c2: " + c2.area());
        System.out.println("Perimetro de c2: " + c2.perimetro());
    }
}
