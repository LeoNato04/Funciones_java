/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz_2;

/**
 *
 * @author casa
 */
public class Matriz_2 {

    public static void main(String[] args) {
         // Definimos las matrices A y B
        int[][] matrizA = {{1, 2},
                           {3, 4},
                           {5, 6}};
        
        int[][] matrizB = {{7 , 8 , 9},
                           {10, 11, 12}};

        // Verificamos si las matrices se pueden multiplicar
        if (matrizA[0].length != matrizB.length) {
            System.out.println("No se pueden multiplicar las matrices.");
            return;} // Salimos del programa si no se pueden multiplicar 

        // Obtenemos el número de filas y columnas de las matrices
        int filasA = matrizA.length;
        int colA_filB = matrizA[0].length;
        int columnasB = matrizB[0].length;

        // Creamos una matriz para almacenar el resultado
        int[][] resultado = new int[filasA][columnasB];

        // Realizamos la multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < colA_filB; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Mostramos la matriz resultante
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}