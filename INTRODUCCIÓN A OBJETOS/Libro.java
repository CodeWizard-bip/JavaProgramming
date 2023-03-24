import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        ISBN = sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        numPaginas = sc.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.cargarLibro();
        libro.mostrarLibro();
    }
}
