package pruebas;
import pruebaInteraccion.Notificador;
import pruebaInteraccion.ServicioNotificacion;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServicioNotificacionTest { 
   @Test
    void testEnviarNotificacionBienvenida_LlamaCorrectamenteAlNotificador() {
        // 1. Crear un objeto "mock" de la interfaz Notificador.
        // Este mock simulará el comportamiento de Notificador.
        Notificador mockNotificador = mock(Notificador.class);

        // 2. Crear una instancia de ServicioNotificacion, inyectándole el mock.
        // Así, ServicioNotificacion usará el objeto simulado en lugar del real.
        ServicioNotificacion servicio = new ServicioNotificacion(mockNotificador);

        String usuario = "XerggiAlmeyda";
        String emailEsperado = "XerggiAlmeyda@ejemplo.com";
        String mensajeEsperado = "Bienvenido a nuestro sistema, XerggiAlmeyda!";
        
        String mensajeEsperadoFalso = "Mensaje incorrecto para causar fallo!"; 
        
        // 3. Se llamar al método de ServicioNotificacion que queremos probar.
        // Esto hará que ServicioNotificacion intente usar el mockNotificador.
        servicio.enviarNotificacionBienvenida(usuario);

        // 4. Verificamos la interacción:
        // Usamos 'verify' de Mockito para asegurar que el método 'enviarMensaje'
        // del 'mockNotificador' fue llamado exactamente una vez (times(1))
        // con los argumentos específicos esperados.
        //verify(mockNotificador, times(1)).enviarMensaje(emailEsperado, mensajeEsperado);
        
        verify(mockNotificador, times(1)).enviarMensaje(emailEsperado, mensajeEsperadoFalso); //esta es la linea que causaria el fallo

        // Verificar que no se llamó a ningún otro método del mock.
        // Esto asegura que solo se ejecutó la interacción esperada.
        //verifyNoMoreInteractions(mockNotificador);
    }
}
