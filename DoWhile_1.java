
package com.mycompany.dowhile_1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class DoWhile_1 {

    public static void main(String[] args) {
      // Programa que encuentra la suma de los dígitos de un número ingresado por el usuario usando un bucle dowhile
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        // Inicializamos la variable donde guardaremos la suma de dígitos
        int suma = 0;
        
        do {suma += numero % 10; // Suma el último dígito al total
            numero /= 10; // Elimina el último dígito del número
        } 
            while (numero > 0); // Continúa mientras haya dígitos en el número

        System.out.println("La suma de los dígitos es: " + suma); // Imprime el resultado
    }
}