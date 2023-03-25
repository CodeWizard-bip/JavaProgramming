public class TestCancion {
    public static void main(String[] args) {
        // Crear objeto Cancion con constructor vacío
        Cancion cancion1 = new Cancion();
        // Asignar valores a los atributos con setters
        cancion1.setTitulo("Bohemian Rhapsody");
        cancion1.setAutor("Queen");
        // Imprimir los valores de los atributos con getters
        System.out.println("Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getAutor());

        // Crear objeto Cancion con constructor que recibe parámetros
        Cancion cancion2 = new Cancion("Stairway to Heaven", "Led Zeppelin");
        // Imprimir los valores de los atributos con getters
        System.out.println("Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }
}
