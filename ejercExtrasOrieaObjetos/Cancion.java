public class Cancion {
    private String titulo;
    private String autor;

    // Constructor vacío
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters
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
}
