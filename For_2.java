/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class For_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario que ingrese el número desde donde comenzará la suma
        System.out.println("Coloque el rango de la suma desde a hasta b (a < b): ");
        System.out.println("Escriba desde cuánto se sumará (a): ");
        int numerodesde = scanner.nextInt();
        
        System.out.println("Escriba hasta cuánto se sumará (b): ");
        int numerohasta = scanner.nextInt();
        int suma = 0;
        
        // Bucle que suma los números en el rango especificado por el usuario
        for (int i = numerodesde; i <= numerohasta; i++) {
            suma += i; // para acumular y sumar los valores en la variable suma;
        }
        System.out.println("La suma es: " + suma);
    }
}