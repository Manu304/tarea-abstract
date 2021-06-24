package com.cunoc.tarea.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToolMR {

    static Scanner scanner = new Scanner(System.in);

    private static void imprimirMensaje(String mensaje) {
        System.out.print("Ingrese " + mensaje + ": ");
    }

    public static int getEntero(String mensaje) {
        int numero = -1;

        do {
            try {
                System.out.print("Ingrese " + " " + mensaje + ": ");
                int ingresado = scanner.nextInt();
                if (ingresado < 0) {
                    System.out.println("\nNo puede ingresar un valor negativo\n");
                }
                numero = ingresado;

            } catch (InputMismatchException e) {
                System.out.println("\nERROR. Debes de ingresar un numero\n");
                scanner.nextLine();
                numero = -1;
            }
        } while (numero < 0);
        return numero;
    }

    public static String getTexto(String mensaje) {
        imprimirMensaje(mensaje);
        scanner.nextLine();
        String res = scanner.nextLine().toUpperCase().trim();
        if (res.length() > 11) {
            res = res.substring(0, 10);
        }
        return res;
    }

    public static int aleatorio(int minimo, int maximo) {
        int aleatorio = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return aleatorio;
    }
    //METODOS QUE PODRIAN USARSE

    public static String getTextoSimple(String mensaje){
        imprimirMensaje(mensaje);
        String res = scanner.next().toUpperCase().trim();
        return res;
    }

    public static String llenarEspacio(String palabra, int max) {
        while (palabra.length() < max) {
            palabra += " ";
        }
        return palabra;
    }

    public static String espacios(int cantidad){
        String espacio = "";
        for (int i = 0; i < cantidad; i++) {
           espacio += " " ;
        }
        return espacio;
    }

    public static String margenes(int cantidad) {
        String guiones = "";
        for (int i = 0; i < cantidad; i++) {
            guiones += "-";
        }
        return guiones;
    }
}