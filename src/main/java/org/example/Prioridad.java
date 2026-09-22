package org.example;

public enum Prioridad {
    ALTA("Alta"),
    MEDIA("media"),
    BAJA("baja");


    private final String etiqueta;

    Prioridad(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta(){return etiqueta;}
}

