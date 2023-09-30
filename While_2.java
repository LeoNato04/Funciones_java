package com.mycompany.while_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class While_2 {
// Programa que te pide un número mayor a 6, si no es así, el bucle se repetirá
    public static void main(String[] args) {
        // Declaración de variables
        int n;
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de 'n' hasta que sea mayor o igual a 2
        while (true) {
            System.out.print("Ingrese n (n >= 6): ");
            n = scanner.nextInt();
            if (n >= 6) {
                break; // Salir del bucle 'while' si 'n' es válido
            } 
            else {
                System.out.println("El valor de n debe ser mayor o igual a 6.");
            }
        }
    }
}