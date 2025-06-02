
package PruebaRegresion;

public class ProcesadorNumerico {
    /**
     * Calcula el cuadrado de un número.
     * Esta es una funcionalidad existente.
     * @param numero
     * @return 
     */
    public int calcularCuadrado(int numero) {
        return numero * numero;
    }

    /**
     * Calcula el doble de un número.
     * Esta es una funcionalidad que podría haberse añadido posteriormente
     * @param numero
     * @return 
     */
    public int calcularDoble(int numero) {
        //Cambio intencional para causar el fallo de regresion.
        if (numero > 0) {
            return numero * 3; 
        }
        return numero * 2;
    }
}

