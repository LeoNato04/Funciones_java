/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Arreglo_2 {

    public static void main(String[] args) {
        double suma = 0; // Valor inicial 0 a suma
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a promediar: ");
        int cantidadNum = scanner.nextInt();

        // Declarar un arreglo para almacenar los números
        double[] numeros = new double[cantidadNum];

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < cantidadNum; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        // Calcular el promedio
        for (int i = 0; i < cantidadNum; i++) {
            suma += numeros[i];
        }
        double promedio = suma / cantidadNum; // La fórmula del promedio

        // Mostrar el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}