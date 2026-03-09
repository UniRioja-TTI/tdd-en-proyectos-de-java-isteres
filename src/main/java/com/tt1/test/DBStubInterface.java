package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas de una base de datos para las tareas.
 * Proporciona métodos para crear, obtener, eliminar y actualizar tareas,
 * así como para registrar y obtener correos electrónicos.
 */
public interface DBStubInterface {
    /**
     * Crea una nueva tarea en el sistema.
     * @param tarea Tarea a crear.
     */
    void createTask(ToDo tarea);

    /**
     * Obtiene la lista completa de tareas registradas.
     * @return Lista de todas las tareas.
     */
    List<ToDo> getTask();

    /**
     * Elimina una tarea específica basándose en su nombre.
     * @param tarea Tarea a eliminar.
     */
    void deleteTask(ToDo tarea);

    /**
     * Actualiza la información de una tarea existente.
     * @param tarea Tarea con los datos actualizados.
     */
    void updateTask(ToDo tarea);

    /**
     * Registra un correo electrónico en la agenda.
     * @param mail Correo electrónico a registrar.
     */
    void registerEmail(String mail);

    /**
     * Obtiene la lista de correos electrónicos registrados.
     * @return Lista de correos electrónicos.
     */
    List<String> getEmails();
}
