package com.cunoc.tarea.principal;

import java.util.ArrayList;

import com.cunoc.tarea.tipos_vehiculos.*;
import com.cunoc.tarea.vehiculos.*;

public class Principal {

    public static void main(String[] args) {
        Principal p = new Principal();
    }

    private ArrayList<Vehiculo> listaVechiculos = new ArrayList<>();

    public Principal() {
        menuPrincipal();
    }

    public void menuPrincipal() {
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println();
            System.out.println(ToolMR.margenes(18) + "MENU PRINCIPAL" + ToolMR.margenes(18));
            System.out.println(
                    "1) Generar Arreglo de carros \n2) Mostrar Carros \n3) Tipo de carro \n4) Acciones con Carro \n5) Salir");
            opcion = ToolMR.getEntero("una opción");
            switch (opcion) {
                case 1 -> {generarArreglo();}
                case 2 -> {mostrarVehiculos();}
                case 3 -> {tipoVehiculo();}
                case 4 -> {seleccionarAccion();}
                case 5 -> {salir = true; System.out.println("\nVuelve de nuevo pronto!\n");}
                default -> {System.out.println("\nUps, esa opción no existe :c\n");}
            }
        }
    }

    private void generarArreglo() {
        int cantidad = ToolMR.getEntero("la cantidad de carros para el arreglo");
        for (int i = 0; i < cantidad; i++) {
            int random = ToolMR.aleatorio(1, 3);
            switch (random) {
                case 1 -> {
                    listaVechiculos.add(new Ferrari());
                }
                case 2 -> {
                    listaVechiculos.add(new IsuzuN());
                }
                case 3 -> {
                    listaVechiculos.add(new ToyotaHiace());
                }
            }
        }
        listaVechiculos.trimToSize();
    }

    private void mostrarVehiculos() {
        System.out.println("\n" + ToolMR.margenes(18) + "LISTA DE CARROS" + ToolMR.margenes(17));
        for (int i = 0; i < listaVechiculos.size(); i++) {
            System.out.println((i + 1) + ". " + listaVechiculos.get(i));
        }
        System.out.println(ToolMR.margenes(50));
    }

    private void tipoVehiculo() {
        System.out.println("\n" + ToolMR.margenes(11) + "¿QUE TIPO DE VEHICULO ES?" + ToolMR.margenes(11));
        mostrarVehiculos();
        int carro = ToolMR.getEntero("el numero del vehiculo que desea evaluar");
        System.out.println();
        if (carro <= listaVechiculos.size()) {
            System.out.println(tipoCarro(listaVechiculos.get(carro - 1)));
        } else {
            System.out.println("\nEse carro no se encuentra en la lista!\n");
            tipoVehiculo();
        }
    }

    private String tipoCarro(Vehiculo vehiculo) {
        String tipo = "nada";
        if (vehiculo instanceof VCamioneta) {
            tipo = vehiculo + " es una camioneta";
        } else if (vehiculo instanceof VCarga) {
            tipo = vehiculo + " es un vehiculo de carga";
        } else if (vehiculo instanceof VCarrera) {
            tipo = vehiculo + " es un vehiculo de carreras";
        }
        return tipo;
    }

    private void seleccionarAccion(){
        mostrarVehiculos();
        int opcion = ToolMR.getEntero("el numero del vehiculo que desee");
        if (opcion <= listaVechiculos.size()) {
            menuAcciones(listaVechiculos.get(opcion-1));
        } else {
            System.out.println("\nEsa opción no esta en la lista!\n");
            seleccionarAccion();
        }
    }

    private void menuAcciones(Vehiculo vehiculo) {
        boolean salir = false;
        while (!salir) {
            System.out.println(ToolMR.margenes(10) + "ACCIONES CON VEHICULOS" + ToolMR.margenes(10));
            System.out.println("1) Girar izquierda \n2) Girar derecha \n3) Llenar tanque \n4) Acelerar \n5) Volver");
            int opcion = ToolMR.getEntero("una opción");
            switch (opcion) {
                case 1 -> {vehiculo.girarIzquierda();}
                case 2 -> {vehiculo.girarDerecha();}
                case 3 -> {vehiculo.llenarTanque();}
                case 4 -> {vehiculo.acelerar();}
                case 5 -> {salir = true;}
                default -> {System.out.println("\nUps, esa opción no esta disponible :c\n");}

            }
        }

    }

}