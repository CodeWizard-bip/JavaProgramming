public class Contador {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i + "-" + j + "-" + k);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
