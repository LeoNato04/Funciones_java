/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if_1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class If_1 {

    public static void main(String[] args) {
        // Programa que determina si un número es primo o no
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a verificar si es primo o no: ");
        int num = scanner.nextInt(); // Número a verificar
        
        boolean esPrimo = true; // Inicializamos asumiendo que es primo
        
        for (int i = 2; i <= num/2; i++) { // Bucle que verifica divisibilidad hasta la mitad del número
            if (num % i == 0) { // Si es divisible, no es primo
                esPrimo = false; // Cambia el estado a no primo
                break;
            }
        }
        
        if (esPrimo) { // Si la bandera esPrimo es verdadera
            System.out.println(num + " es un número primo."); // Imprime que es primo
        } else { // Si no es primo
            System.out.println(num + " no es un número primo."); // Imprime que no es primo
        }
    }
}