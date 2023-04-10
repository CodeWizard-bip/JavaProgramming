
package Entidades;

public class NIF {
    private long dni;
    private char letra;

    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    private char calcularLetra(long dni) {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = (int) (dni % 23);
        return tabla.charAt(resto);
    }

    public String mostrar() {
        return String.format("%08d-%c", dni, letra);
    }
}
