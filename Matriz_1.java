/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz_1;

/**
 *
 * @author casa
 */
public class Matriz_1 {
    
    public static void main(String[] args) {
        // Definimos las dos matrices
        int[][] matrizA = {{1, 2, 3}, 
                           {4, 5, 6},
                           {7, 8, 9}};
        
        int[][] matrizB = {{9, 8, 7},
                           {6, 5, 4},
                           {3, 2, 1}};

        // Verificamos si las matrices tienen el mismo tamaño
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("No se pueden sumar matrices de tamaños diferentes.");
            return;
        }
        // se asignan la cantidad de filas y columnas de una matrizA a la matriz resultado
        int filas = matrizA.length; 
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        // Realizamos la suma de matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostramos la matriz resultante
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
