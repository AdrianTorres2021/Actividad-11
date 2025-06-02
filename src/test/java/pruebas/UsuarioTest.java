/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebas;

import Parte_5_prueba_mockito.Notificador;
import Parte_5_prueba_mockito.Usuario;
import org.junit.jupiter.api.Test; // Para la anotación @Test
import static org.mockito.Mockito.*; 
public class UsuarioTest {
    
     @Test
    void testEnviarMensajeBienvenida_NotificadorEsLlamadoCorrectamente() {
        //Crear un "mock" de la interfaz Notificador.
        //Mockito creará un objeto simulado que podemos controlar y verificar.
        Notificador mockNotificador = mock(Notificador.class);

        //Datos del usuario para la prueba.
        String nombreUsuario = "Ana Perez";
        String emailUsuario = "ana.perez@example.com";
        String mensajeEsperado = "¡Hola Ana Perez! Bienvenido/a a nuestro sistema.";

        //Crear una instancia de la clase Usuario, inyectándole nuestro mock de Notificador.
        //Así, cuando Usuario intente notificar, usará el objeto simulado.
        Usuario usuario = new Usuario(nombreUsuario, emailUsuario, mockNotificador);

        //Ejecutar el método de la clase Usuario que queremos probar.
        usuario.enviarMensajeBienvenida();

        //Verificar la interacción:
        //Usamos 'verify' de Mockito para asegurar que el método 'notificador.notificar()' fue llamado 1 vez
        verify(mockNotificador, times(1)).notificar(emailUsuario, mensajeEsperado);

        verifyNoMoreInteractions(mockNotificador);
    }

    @Test
    void testEnviarMensajeBienvenida_NoLlamaSiNoSeQuiere() {
        Notificador mockNotificador = mock(Notificador.class);
        Usuario usuario = new Usuario("Invitado", "invitado@example.com", mockNotificador);
        //Este segundo test se utiliza para verificar que un metodo no fue llamado
        verify(mockNotificador, never()).notificar(anyString(), anyString());
    }
}
