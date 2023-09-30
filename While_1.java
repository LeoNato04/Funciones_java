

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class While_1 {
    // Programa para contabilizar números de 1 alnúmero que ponga el usuario
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        // Se agrega el texto que aparecerá para que el usuario ponga el número que desee que el programa cuente
        System.out.print("Ingrese un número: ");
        // Leer el número ingresado por el usuario y almacenarlo en la variable 'n'
        int n = scanner.nextInt();
        // Se asigna el valor 1 en la variable "i"
        int i = 1;
        
        // Se inicia un bucle donde conforme los números van subiendo de uno en uno desde 1 hasta el número "n".
        while (i <= n){
            // Imprimir el valor de 'i'
            System.out.print( i + " ");
            // Se incrementa 1 a "i"
            i++;   
        }
    }
}
