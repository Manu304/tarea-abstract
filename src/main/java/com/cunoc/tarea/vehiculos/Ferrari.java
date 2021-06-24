package com.cunoc.tarea.vehiculos;

import com.cunoc.tarea.tipos_vehiculos.VCarrera;
import com.cunoc.tarea.vehiculos.Combustible;

public class Ferrari extends Vehiculo implements VCarrera {

    public Ferrari() {
        super(Combustible.DIESEL, "Ferrari2021");
    }

    @Override
    public void acelerar() {
        System.out.println(this.getModelo() + " está acelerando a maxima velocidad");
        
    }

    @Override
    public void llenarTanque() {
        System.out.println(this.getModelo() + " esta llenando el tanque con gasolina " + this.getCombustible());
        
    }

    @Override
    public void recorrerPista(int vueltas) {
        System.out.println(this.getModelo() + " va a recorrer " + vueltas + " vueltas de una pista");
        
    }
    
}
