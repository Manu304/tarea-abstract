package com.cunoc.tarea.vehiculos;

import com.cunoc.tarea.tipos_vehiculos.VCamioneta;

public class ToyotaHiace extends Vehiculo implements VCamioneta{
    

    public ToyotaHiace() {
        super(Combustible.REGULAR, "Toyota Hiace");
    }

    @Override
    public void llevarPasajeros(double precio) {
        System.out.println(this + " lleva pasajeros por Q." + precio + " c/u");
        
    }

    @Override
    public void acelerar() {
        System.out.println(this + " acelera a una velocidad prodente");
        
    }

    @Override
    public void llenarTanque() {
        System.out.println(this + " esta llenando el tanque con gasolina " + this.getCombustible());
        
    }

    
}