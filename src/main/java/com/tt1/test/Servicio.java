package com.tt1.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementación de {@link ServicioInterface} que orquestra la lógica de las tareas ToDo.
 * Utiliza un repositorio para el almacenamiento y un servicio de correo para notificaciones.
 */
public class Servicio implements ServicioInterface {
    /** El repositorio encargado de la persistencia. */
    private final RepositorioInterface repositorio;
    /** El servicio de envío de correos. */
    private final MailerInterface mailer;

    /**
     * Crea un nuevo servicio inyectando sus dependencias.
     * 
     * @param repositorio Repositorio de tareas.
     * @param mailer Servicio de correo electrónico.
     */
    public Servicio(RepositorioInterface repositorio, MailerInterface mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    /**
     * Crea un nuevo servicio por defecto inicializando sus propias dependencias.
     */
    public Servicio() {
        this.repositorio = new Repositorio();
        this.mailer = new MailerStub();
    }

    /**
     * {@inheritDoc}
     * Crea una instancia de {@link ToDo}, configura sus campos y la persiste.
     */
    @Override
    public void crearTarea(String nombre, LocalDate fecha) {
        ToDo t = new ToDo();
        t.setNombre(nombre);
        t.setFechaLimite(fecha);
        t.setCompletado(false);
        repositorio.persistirTarea(t);
    }

    /**
     * {@inheritDoc}
     * Delega el registro del correo al repositorio.
     */
    @Override
    public void registrarEmail(String email) {
        repositorio.guardarEmail(email);
    }

    /**
     * {@inheritDoc}
     * Delega el marcado de la tarea como completada al repositorio.
     */
    @Override
    public void completarTarea(String nombre) {
        repositorio.marcarCompletada(nombre);
    }

    /**
     * {@inheritDoc}
     * Filtra la lista total de tareas del repositorio para devolver solo las no completadas.
     */
    @Override
    public List<ToDo> listarPendientes() {
        return repositorio.listarTodas().stream()
                .filter(t -> !t.getCompletado())
                .collect(Collectors.toList());
    }
}
