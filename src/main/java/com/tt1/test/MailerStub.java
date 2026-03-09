package com.tt1.test;

/**
 * Implementación de {@link MailerInterface} que simula el envío de correos electrónicos
 * mediante la impresión de mensajes por consola.
 */
public class MailerStub implements MailerInterface {
    /**
     * {@inheritDoc}
     * Simula el envío de un correo imprimiendo el destinatario y el mensaje.
     * Realiza validaciones básicas sobre la dirección de correo y el texto.
     */
    @Override
    public boolean enviarMensaje(String email, String texto) {
        if (email == null || email.isEmpty() || texto == null) {
            return false;
        }
        System.out.println("Destino: " + email);
        System.out.println("Mensaje: " + texto);
        return true;
    }
}
