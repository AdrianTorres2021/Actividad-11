
package pruebaLogica;

public class ValidarTexto {
    public boolean esLongitudValida(String texto, int longitudMinima) {
        if (texto == null) {
            return false;
        }
        return texto.length() > longitudMinima;
    }
}
