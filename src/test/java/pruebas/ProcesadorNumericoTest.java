
package pruebas;

import PruebaRegresion.ProcesadorNumerico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesadorNumericoTest {
    
    @Test
    void testCalcularCuadrado() {
        ProcesadorNumerico procesador = new ProcesadorNumerico();
        assertEquals(9, procesador.calcularCuadrado(3)); // 3*3 = 9
        assertEquals(0, procesador.calcularCuadrado(0)); // 0*0 = 0
        assertEquals(25, procesador.calcularCuadrado(-5)); // (-5)*(-5) = 25
    }

    @Test
    void testCalcularDoble() {
        ProcesadorNumerico procesador = new ProcesadorNumerico();
        assertEquals(6, procesador.calcularDoble(3)); // 3*2 = 6
        assertEquals(-4, procesador.calcularDoble(-2)); // -2*2 = -4
    }
}
