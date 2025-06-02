
package pruebaInteraccion;


public class ServicioNotificacion {
     private Notificador notificador;

    public ServicioNotificacion(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacionBienvenida(String usuario) {
        String mensaje = "Bienvenido a nuestro sistema, " + usuario + "!";
        notificador.enviarMensaje(usuario + "@ejemplo.com", mensaje);
    }
}
