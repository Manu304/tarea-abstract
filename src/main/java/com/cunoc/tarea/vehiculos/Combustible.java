package com.cunoc.tarea.vehiculos;

public enum Combustible {
    DIESEL("Diesel"), 
    GASOLINA("Gasolina"), 
    REGULAR("Regular");

    private String nombre;

    Combustible(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}