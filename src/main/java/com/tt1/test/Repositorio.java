package com.tt1.test;

import java.util.List;

/**
 * Implementación de {@link RepositorioInterface} que gestiona el acceso a las tareas
 * a través de un objeto {@link DBStubInterface}.
 */
public class Repositorio implements RepositorioInterface {
    /** La instancia de la base de datos simulada. */
    private final DBStubInterface db;

    /**
     * Crea un nuevo repositorio con una base de datos específica.
     * @param db La base de datos simulada que se usará.
     */
    public Repositorio(DBStubInterface db) {
        this.db = db;
    }

    /**
     * Crea un nuevo repositorio por defecto con un {@link DBStub} interno.
     */
    public Repositorio() {
        this.db = new DBStub();
    }

    /**
     * {@inheritDoc}
     * Realiza la búsqueda de la tarea en la base de datos usando streams.
     */
    @Override
    public ToDo encontrarPorNombre(String nombre) {
        if (nombre == null) return null;
        return db.getTask().stream()
                .filter(t -> nombre.equals(t.getNombre()))
                .findFirst()
                .orElse(null);
    }

    /**
     * {@inheritDoc}
     * Busca la tarea por nombre, cambia su estado y la actualiza en la base de datos.
     */
    @Override
    public void marcarCompletada(String nombre) {
        ToDo t = encontrarPorNombre(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.updateTask(t);
        }
    }

    /**
     * {@inheritDoc}
     * Almacena la tarea en la base de datos.
     */
    @Override
    public void persistirTarea(ToDo tarea) {
        if (tarea != null) {
            db.createTask(tarea);
        }
    }

    /**
     * {@inheritDoc}
     * Obtiene todas las tareas registradas en la base de datos.
     */
    @Override
    public List<ToDo> listarTodas() {
        return db.getTask();
    }

    /**
     * {@inheritDoc}
     * Envía la dirección de correo electrónico a la base de datos para guardarla.
     */
    @Override
    public void guardarEmail(String email) {
        db.registerEmail(email);
    }

    /**
     * {@inheritDoc}
     * Recupera todos los correos electrónicos de la base de datos.
     */
    @Override
    public List<String> obtenerEmails() {
        return db.getEmails();
    }
}
