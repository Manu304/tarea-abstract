package com.cunoc.tarea.vehiculos;

import com.cunoc.tarea.*;
import com.cunoc.tarea.movimiento_vehiculos.Giro;
import com.cunoc.tarea.principal.ToolMR;

public abstract class Vehiculo implements Giro{
    private int id;
    private String modelo;
    private Combustible combustible;
    private double cantGasofa;
    private int cantPasajeros;
    private double velocidadMax;
    private double aceleracionBase;

    public Vehiculo(Combustible combustible, String modelo){
        this.combustible = combustible;
        this.modelo = modelo;
        this.cantGasofa = ToolMR.aleatorio(100, 300);
        this.cantPasajeros = ToolMR.aleatorio(1, 5);
        this.velocidadMax = ToolMR.aleatorio(40, 80);
        this.aceleracionBase = ToolMR.aleatorio(0, 100);
        this.id = ToolMR.aleatorio(100, 999);
    }

    public abstract void acelerar();
    public abstract void llenarTanque();


    @Override
    public void girarDerecha() {
        System.out.println(modelo + " ha girado a la derecha");
        
    }

    @Override
    public void girarIzquierda() {
        System.out.println(modelo + " ha girado a la izquierda");
        
    }

    @Override
    public String toString() {
        return modelo + id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public double getCantGasofa() {
        return cantGasofa;
    }

    public void setCantGasofa(double cantGasofa) {
        this.cantGasofa = cantGasofa;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    

}
