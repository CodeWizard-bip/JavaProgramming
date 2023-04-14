
package Entidades;


public class Cadena {
    private String frase;
    private int longitud;

    // Constructor vacío
    public Cadena() {
    }

    // Constructor con atributo frase solamente
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
