/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.case_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Case_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nota: ");
        int nota = scanner.nextInt(); // Cambia esta variable para probar diferentes casos

        switch (nota) {
            case 19:
            case 20:
                System.out.println("AD - Excelente trabajo");
                break;
            case 16:
            case 17:
            case 18:    
                System.out.println("A+ - Muy buen trabajo");
                break;
            case 13:
            case 14:
            case 15:
                System.out.println("A - Buen trabajo");
                break;
            case 11:
            case 12:
                System.out.println("B - Trabajo aceptable");
                break;
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("C - Desaprobado");
                break;
            default:
                System.out.println("Nota no válida");
                break;
        }
    }
}