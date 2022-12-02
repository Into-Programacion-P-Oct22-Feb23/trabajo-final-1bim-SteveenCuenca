/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int contador = 2;
        double resultado = 0;
        System.out.println("Ingrese el número que desea sumar");
        numero = entrada.nextInt();
        if (numero >= 2) {
            while (contador <= 2) {
                resultado = numero + contador;
                contador = contador + 2;
                System.out.println("---------------------------------------");
                System.out.printf("La suma de los pares: %d es: %.0f\n",
                        numero, resultado);
            }
        } else {
            if (numero < 2) {
                System.out.println("--------------------------------");
                System.out.println("Error el numero es menor a 2");
            }
        }
    }
} 
