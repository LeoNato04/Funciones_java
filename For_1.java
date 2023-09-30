/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for_1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class For_1 {
    // En este código crearemos una tabla de multiplicar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario que ingrese el número para la tabla de multiplicar
        System.out.println("La tabla de multiplicar será del número: ");
        int numero = scanner.nextInt();
        
        // Pide al usuario que ingrese hasta qué número quiere la tabla de multiplicar
        System.out.println("Escribe hasta cuánto será la tabla: ");
        int cantidad = scanner.nextInt();
        
        // Este bucle for imprime la tabla de multiplicar del "numero" del 0 a "cantidad"
        for (int i = 0; i <= cantidad; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}