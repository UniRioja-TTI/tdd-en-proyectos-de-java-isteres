package com.tt1.test;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * Clase que representa una tarea individual en el sistema ToDo.
 * Sigue la especificación JavaBean y es serializable.
 */
public class ToDo implements Serializable, ToDoInterface {
    /** Nombre identificativo de la tarea. */
    private String nombre;
    /** Descripción detallada de la tarea. */
    private String descripcion;
    /** Fecha en la que la tarea debe estar terminada. */
    private LocalDate fechaLimite;
    /** Estado que indica si la tarea ha sido finalizada. */
    private boolean completado;

    /**
     * Constructor vacío requerido por la especificación JavaBean.
     */
    public ToDo() {}

    // Getters y Setters con herencia de Javadoc
    @Override public String getNombre() { return nombre; }
    @Override public void setNombre(String nombre) { this.nombre = nombre; }

    @Override public String getDescripcion() { return descripcion; }
    @Override public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override public LocalDate getFechaLimite() { return fechaLimite; }
    @Override public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }

    @Override public boolean getCompletado() { return completado; }
    @Override public void setCompletado(boolean completado) { this.completado = completado; }
}
