
package Servicios;

import Entidades.Cadena;

public class CadenaServicio {
    private final Cadena cadena;

    public CadenaServicio() {
        this.cadena = new Cadena();
    }

    public CadenaServicio(String frase) {
        this.cadena = new Cadena(frase);
    }

    public void setFrase(String frase) {
        cadena.setFrase(frase);
        cadena.setLongitud(frase.length());
    }

    public String getFrase() {
        return cadena.getFrase();
    }

    public int getLongitud() {
        return cadena.getLongitud();
    }

    public int mostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase() {
        String frase = cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        String frase = cadena.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toString(frase.charAt(i)).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public int compararLongitud(String frase) {
        return cadena.getFrase().length() - frase.length();
    }

     public String unirFrases(String frase) {
        return cadena.getFrase() + " " + frase;
    }

    public String reemplazar(String letra, String reemplazo) {
        String frase = cadena.getFrase();
        return frase.replace(letra, reemplazo);
    }




    public boolean contiene(String letra) {
        String frase = cadena.getFrase();
        return frase.contains(letra);
    }
}
