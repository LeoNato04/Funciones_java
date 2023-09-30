
package com.mycompany.dowhile_2;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class DoWhile_2 {

    public static void main(String[] args) {
      // Programa que calcula el promedio de notas.
        Scanner scanner = new Scanner(System.in);
        
        // Inicializamos la variable donde guardaremos la suma de dígitos
        int notas = 0;
        double sumaNotas = 0;
        int cantidadNotas = 0;
        double promedio;
        
        // Bucle para asegurarse de ingresar una cantidad válida de notas (mayor a cero)
        do {System.out.print("Ingresa la cantidad de notas que quieres promediar: ");
            cantidadNotas = scanner.nextInt();
        } while (cantidadNotas <= 0);

        // Bucle para ingresar las notas y calcular el promedio
        do {System.out.print("Ingresa la nota " + (notas + 1) + ": ");
            double nota = scanner.nextDouble();
            boolean notaValida = nota >= 0 && nota <= 20; // Verifica si la nota es válida
            // Se agrega la nota al total solo si es válida, de lo contrario, se agrega cero
            sumaNotas += nota * (notaValida ? 1 : 0);
            // Se incrementa el contador de notas solo si la nota es válida
            notas += notaValida ? 1 : 0;
        } while (notas <= cantidadNotas); // Continúa hasta alcanzar la cantidad de notas ingresadas

        // Calcular el promedio
        promedio = sumaNotas / cantidadNotas;
        // Imprimir el resultado
        System.out.println("El promedio de las " + cantidadNotas + " notas es: " + promedio);
    }
}