/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimple_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author casa
 */
public class ListaSimple_1 {

    public static void main(String[] args) {
        // Creamos una lista de números enteros
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Agregamos elementos a la lista
        listaNumeros.add(null);
        listaNumeros.add(24);
        listaNumeros.add(13);
        listaNumeros.add(62);

        Scanner scanner = new Scanner(System.in);
        char opcion;

        // Variable para rastrear el índice actual
        int indiceActual = 0;

        do {System.out.println("(a) para avanzar, (s) para salir");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a' -> {
                    // Mover al siguiente nombre si es posible
                    if (indiceActual < listaNumeros.size() - 1) {
                        indiceActual++;
                        System.out.println("Nombre actual: " + listaNumeros.get(indiceActual));
                    } else {
                        System.out.println("No hay más nombres siguientes."); // para evitar un bucle infinito de siguientes
                    }
                }
                case 's' -> System.out.println("¡Hasta luego!"); // Caso para salir
                
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 's');
    }
}
