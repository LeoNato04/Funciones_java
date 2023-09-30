/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo_1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Arreglo_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: "); // Solicitamos al usuario ingresar el tamaño de su lista
        int tamano = scanner.nextInt();
        // Acceso y manipulación de elementos en el arreglo
        int[] numeros = new int[tamano]; // Se alamacena el tamaño en la variable "tamaño"

        System.out.println("Ingrese " + tamano + " números:");

         // Llenar el arreglo con los números ingresados por el usuario
        for (int i = 0; i < tamano; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los elementos del arreglo son:");

        // Imprimir los elementos del arreglo
        for (int i = 0; i < tamano; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}