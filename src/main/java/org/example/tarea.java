package org.example;

import java.util.ArrayList;

public class tarea {
    private String descripcion;
    private boolean completada;
    ArrayList<String> prioridades = new ArrayList(); //creo una lista para las prioridades


    // toda tarea añadida empieza como no completada (constructor)
    public tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;

    }

    private ArrayList<String> prioridades() {
        prioridades.add("Alta");
        prioridades.add("Media");
        prioridades.add("Baja");

    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }
    public void marcarComoHecha() {
        this.completada = true;
    }

    // como se va a ver
    @Override
    public String toString(){

        String estado = completada ? "[Hecha]" : "[No hecha]";
        return estado + " " + descripcion;
    }
}
