package com.cunoc.tarea.vehiculos;

import com.cunoc.tarea.tipos_vehiculos.VCarga;

public class IsuzuN extends Vehiculo implements VCarga {

    public IsuzuN() {
        super(Combustible.DIESEL, "Isuzu N-");
    }

    @Override
    public void cargar(String material) {
        System.out.println(this + " esta cargando " + material);
        
    }

    @Override
    public void acelerar() {
        System.out.println(this + " acelera a baja velocidad");
        
    }

    @Override
    public void llenarTanque() {
        System.out.println(this + " esta llenando el tanque con gasolina " + this.getCombustible());
        
    }
    
}
