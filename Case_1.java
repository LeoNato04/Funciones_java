/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.case_1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Case_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu calificacion (AD, A+, A, B o C): ");
        String calificacion = scanner.nextLine(); // Definimos una variable para representar la calificación

        switch (calificacion) { // Iniciamos el bloque switch usando la variable calificacion
            case "AD":
                System.out.println("Excelente"); // Si calificacion es 'A', imprime "Excelente"
                break; // Salimos del switch
            case "A+":
                System.out.println("Buen trabajo"); // Si calificacion es 'B', imprime "Buen trabajo"
                break; 
            case "A":
                System.out.println("Aprobado"); // Si calificacion es 'C', imprime "Aprobado"
                break; 
            case "B":
                System.out.println("Puede mejorar"); // Si calificacion es 'D', imprime "Puede mejorar"
                break; 
            case "C":
                System.out.println("No aprobado"); // Si calificacion es 'F', imprime "No aprobado"
                break; 
            default:
                System.out.println("Calificación no válida"); // Si no se cumple ningún caso, imprime esto
                break; 
        }
    }
}
