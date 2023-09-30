/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class If_2 {

    public static void main(String[] args) {
        // En este código se sumarán los números pares e impares en un rango definido por el usuario
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int sumaImpares = 0;
           // Strings para almacenar la lista de números pares e impares
        String listaPares = "";
        String listaImpares = "";
        
        // Se piden los datos respectivos al usuario
        System.out.println("Coloque el rango de la suma desde a hasta b (a < b): ");
        System.out.println("Escriba desde cuánto se sumará (a): ");
        int numeroDesde = scanner.nextInt();
        
        System.out.println("Escriba hasta cuánto se sumará (b): ");
        int numeroHasta = scanner.nextInt();
        
        // Este bucle for suma los números pares e impares de a - b
       
        for (int i = numeroDesde; i <= numeroHasta; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
                listaPares += i;
                if (i < numeroHasta - 1 && (i + 2) % 2 == 0) {
                    listaPares += " + ";
                } else if (i == numeroHasta) {
                    listaPares += " = ";
                }
            } else {
                sumaImpares += i;
                listaImpares += i;
                if (i < numeroHasta - 1 && (i + 2) % 2 != 0) {
                    listaImpares += " + ";
                } else if (i == numeroHasta) {
                    listaImpares += " = ";
                }
            }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La lista de números pares es: " + listaPares + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
        System.out.println("La lista de números impares es: " + listaImpares + sumaImpares);
    }
}