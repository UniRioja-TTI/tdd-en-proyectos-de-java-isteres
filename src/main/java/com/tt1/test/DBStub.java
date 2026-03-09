package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de {@link DBStubInterface} que utiliza listas en memoria para
 * simular el almacenamiento persistente de tareas y correos electrónicos.
 */
public class DBStub implements DBStubInterface {
    /** Lista interna para almacenar las tareas. */
    private List<ToDo> tareas = new ArrayList<>();
    /** Lista interna para almacenar los correos electrónicos. */
    private List<String> agendaEmails = new ArrayList<>();

    /**
     * {@inheritDoc}
     * Añade una tarea a la lista interna.
     */
    @Override
    public void createTask(ToDo tarea) {
        tareas.add(tarea);
    }

    /**
     * {@inheritDoc}
     * Devuelve una copia de la lista de tareas.
     */
    @Override
    public List<ToDo> getTask() {
        return new ArrayList<>(tareas);
    }

    /**
     * {@inheritDoc}
     * Elimina una tarea basándose en su nombre.
     */
    @Override
    public void deleteTask(ToDo tarea) {
        tareas.removeIf(t -> t.getNombre().equals(tarea.getNombre()));
    }

    /**
     * {@inheritDoc}
     * Busca la tarea por nombre y la actualiza en la lista.
     */
    @Override
    public void updateTask(ToDo tarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equals(tarea.getNombre())) {
                tareas.set(i, tarea);
                break;
            }
        }
    }
    
    /**
     * {@inheritDoc}
     * Registra el correo electrónico si no existe ya en la agenda.
     */
    @Override
    public void registerEmail(String mail) {
        if (!agendaEmails.contains(mail)) {
            agendaEmails.add(mail);
        }
    }

    /**
     * {@inheritDoc}
     * Devuelve una copia de la lista de correos electrónicos registrados.
     */
    @Override
    public List<String> getEmails(){
        return new ArrayList<>(agendaEmails);
    }
}
