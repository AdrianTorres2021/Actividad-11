
package Parte_5_prueba_mockito;
//Representa un usuario que puede interactuar con un servicio de notificación.
 
public class Usuario {
    private String nombre;
    private String email;
    private Notificador notificador; 

    public Usuario(String nombre, String email, Notificador notificador) {
        this.nombre = nombre;
        this.email = email;
        this.notificador = notificador;
    }

    public void enviarMensajeBienvenida() {
        String mensaje = "¡Hola " + nombre + "! Bienvenido/a a nuestro sistema.";
        notificador.notificar(this.email, mensaje); // Llama al método notificar de la dependencia
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
