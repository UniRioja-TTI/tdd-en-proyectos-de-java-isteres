package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

/**
 * Interfaz que define la lógica de negocio para la gestión de tareas ToDo.
 * Proporciona métodos para crear, completar y listar tareas.
 */
public interface ServicioInterface {
    /**
     * Crea una nueva tarea con el nombre y la fecha límite especificados.
     * 
     * @param nombre Nombre descriptivo de la tarea.
     * @param fecha Fecha límite para completar la tarea.
     */
    void crearTarea(String nombre, LocalDate fecha);

    /**
     * Registra un correo electrónico en el sistema.
     * 
     * @param email Dirección de correo electrónico a registrar.
     */
    void registrarEmail(String email);

    /**
     * Marca la tarea identificada por su nombre como completada.
     * 
     * @param nombre Nombre de la tarea que se desea completar.
     */
    void completarTarea(String nombre);

    /**
     * Devuelve una lista con todas las tareas que no han sido completadas.
     * 
     * @return Lista de objetos {@link ToDo} pendientes.
     */
    List<ToDo> listarPendientes();
}
