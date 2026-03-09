package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define las operaciones de acceso a datos para las tareas.
 * Actúa como un puente entre la lógica de negocio y el sistema de almacenamiento.
 */
public interface RepositorioInterface {
    /**
     * Busca una tarea en el repositorio por su nombre.
     * 
     * @param nombre Nombre de la tarea a buscar.
     * @return Tarea encontrada o null si no existe.
     */
    ToDo encontrarPorNombre(String nombre);

    /**
     * Marca una tarea como completada basándose en su nombre.
     * 
     * @param nombre Nombre de la tarea a marcar.
     */
    void marcarCompletada(String nombre);

    /**
     * Guarda una nueva tarea en el sistema de persistencia.
     * 
     * @param tarea Tarea a persistir.
     */
    void persistirTarea(ToDo tarea);

    /**
     * Devuelve la lista de todas las tareas almacenadas.
     * 
     * @return Lista de todas las tareas.
     */
    List<ToDo> listarTodas();

    /**
     * Guarda una dirección de correo electrónico en el sistema.
     * 
     * @param email Dirección de correo a guardar.
     */
    void guardarEmail(String email);

    /**
     * Recupera todas las direcciones de correo electrónico almacenadas.
     * 
     * @return Lista de correos electrónicos.
     */
    List<String> obtenerEmails();
}
