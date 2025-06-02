
package Parte_5_prueba_mockito;


public interface Notificador {
     /**
     * Envía un mensaje a un destinatario específico.
     * @param destinatario La dirección o identificador del destinatario.
     * @param mensaje El contenido del mensaje a enviar.
     */
    void notificar(String destinatario, String mensaje);
}
