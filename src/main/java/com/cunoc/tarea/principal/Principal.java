package com.cunoc.tarea.principal;

import java.util.ArrayList;

import com.cunoc.tarea.vehiculos.Ferrari;
import com.cunoc.tarea.vehiculos.Vehiculo;

public class Principal {
    
    public static void main(String[] args) {
        Principal p = new Principal();
    }

    private ArrayList <Vehiculo> listaVechiculos = new ArrayList<>();

    public Principal(){
        menuPrincipal();
    }

    public void menuPrincipal(){
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println();
            System.out.println(ToolMR.margenes(18) + "MENU PRINCIPAL" + ToolMR.margenes(18));
            System.out.println("1) Generar Arreglo de carros \n2) Mostrar Carros \n3) Movimientos de carros \n4) Salir");
            opcion = ToolMR.getEntero("una opción");
            switch (opcion) {
                case 1 -> {generarArreglo();}
                case 2 -> {mostrarVehiculos();}
                case 3 -> {}
                case 4 -> {salir = true; System.out.println("\nVuelve a luchar de nuevo pronto!\n");}
                default -> {System.out.println("\nUps, esa opción no existe :c\n");}
            }
        }
    }

    public void generarArreglo() {
        int cantidad = ToolMR.getEntero("la cantidad de carros para el arreglo");
        for (int i = 0; i < cantidad; i++) {
            int random = ToolMR.aleatorio(1, 3);
            switch (random) {
                case 1 -> {listaVechiculos.add(new Ferrari());}
                case 2 -> {listaVechiculos.add(new Ferrari());}
                case 3 -> {listaVechiculos.add(new Ferrari());}
            }
        }
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : listaVechiculos) {
            System.out.println(vehiculo);
        }
    }
    
}