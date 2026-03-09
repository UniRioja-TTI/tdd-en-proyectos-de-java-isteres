package com.tt1.test;

import java.time.LocalDate;

/**
 * Interfaz que define las propiedades y comportamientos de una tarea ToDo.
 */
public interface ToDoInterface {
    /**
     * Obtiene el nombre de la tarea.
     * @return Nombre de la tarea.
     */
    String getNombre();

    /**
     * Establece el nombre de la tarea.
     * @param nombre Nuevo nombre para la tarea.
     */
    void setNombre(String nombre);

    /**
     * Obtiene la descripción detallada de la tarea.
     * @return Descripción de la tarea.
     */
    String getDescripcion();

    /**
     * Establece una descripción para la tarea.
     * @param descripcion Nueva descripción.
     */
    void setDescripcion(String descripcion);

    /**
     * Obtiene la fecha límite fijada para la tarea.
     * @return Fecha límite.
     */
    LocalDate getFechaLimite();

    /**
     * Establece la fecha límite para completar la tarea.
     * @param fechaLimite Nueva fecha límite.
     */
    void setFechaLimite(LocalDate fechaLimite);

    /**
     * Indica si la tarea ya ha sido completada.
     * @return true si está completada, false en caso contrario.
     */
    boolean getCompletado();

    /**
     * Cambia el estado de completado de la tarea.
     * @param completado Nuevo estado de la tarea.
     */
    void setCompletado(boolean completado);
}
