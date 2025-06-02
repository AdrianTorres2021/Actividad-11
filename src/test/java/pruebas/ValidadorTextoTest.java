/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import pruebaLogica.ValidarTexto;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Xerggi
 */
public class ValidadorTextoTest {
     @Test // Marca este método como una prueba unitaria
    void testEsLongitudValida_Correcto() {
        ValidarTexto validador = new ValidarTexto();
        // Esperamos que "Hola Mundo" sea válido si el mínimo es 5
        assertTrue(validador.esLongitudValida("Hola Mundo", 5));
    }

    @Test
    void testEsLongitudValida_Corto() {
        ValidarTexto validador = new ValidarTexto();
        // Esperamos que "Hola" no sea válido si el mínimo es 5
        assertFalse(validador.esLongitudValida("Hola", 5));
    }

    @Test
    void testEsLongitudValida_Nulo() {
        ValidarTexto validador = new ValidarTexto();
        // Esperamos que un texto nulo no sea válido
        assertFalse(validador.esLongitudValida(null, 0));
    }

}
