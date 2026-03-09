package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase principal que inicia la aplicación ToDo.
 * Esta clase contiene el método main que demuestra el funcionamiento básico
 * de la gestión de tareas, incluyendo su creación, listado y completado.
 */
public class App {
    /**
     * Punto de entrada de la aplicación.
     * Crea un servicio de tareas, añade algunas tareas de ejemplo, 
     * muestra las pendientes, completa una y simula el envío de un correo.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Iniciando Aplicación ToDo ---");
        
        ServicioInterface servicio = new Servicio();
        
        System.out.println("Creando tareas...");
        servicio.crearTarea("Aprender TDD", LocalDate.now().plusDays(5));
        servicio.crearTarea("Implementar Mocks", LocalDate.now().plusDays(2));
        
        List<ToDo> pendientes = servicio.listarPendientes();
        System.out.println("Tareas pendientes: " + pendientes.size());
        for (ToDo t : pendientes) {
            System.out.println(" - " + t.getNombre() + " (Límite: " + t.getFechaLimite() + ")");
        }
        
        System.out.println("\nCompletando una tarea...");
        servicio.completarTarea("Aprender TDD");
        
        pendientes = servicio.listarPendientes();
        System.out.println("Tareas pendientes ahora: " + pendientes.size());
        
        System.out.println("\nEnviando recordatorio de prueba...");
        MailerInterface mailer = new MailerStub();
        mailer.enviarMensaje("alumno@ur.es", "Tienes tareas pendientes.");
        
        System.out.println("--- Fin de la Aplicación ---");
    }
}
