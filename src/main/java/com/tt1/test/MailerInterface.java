package com.tt1.test;

/**
 * Interfaz que define el servicio de envío de correos electrónicos.
 */
public interface MailerInterface {
    /**
     * Envía un correo electrónico con el contenido especificado.
     * 
     * @param email Dirección del destinatario.
     * @param texto Cuerpo del mensaje.
     * @return true si el mensaje fue enviado correctamente, false en caso contrario.
     */
    boolean enviarMensaje(String email, String texto);
}
