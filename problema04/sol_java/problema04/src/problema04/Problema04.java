/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dato01;
        int dato02;
        int dato03;
        int datoMayor = 0;
        System.out.println("Ingrese el primer dato");
        dato01 = entrada.nextInt();
        System.out.println("Ingrese el segundo dato");
        dato02 = entrada.nextInt();
        System.out.println("Ingrese el tercer dato");
        dato03 = entrada.nextInt();
        if (dato01 == dato02 || dato01 == dato03) {
            System.out.println("------------------------------");
            System.out.println("Error son datos iguales");
        } else {
            if (dato02 == dato03 || dato02 == dato03) {
                System.out.println("----------------------------");
                System.out.println("Error son datos iguales");
            } else {
                if (dato01 > dato02 && dato01 > dato03) {
                    datoMayor = dato01;
                } else {
                    if (dato02 > dato01 && dato02 > dato03) {
                        datoMayor = dato02;
                    } else {
                        if (dato03 > dato02 && dato03 > dato01) {
                            datoMayor = dato03;
                        }
                    }
                }
                System.out.println("---------------------------------");
                System.out.printf("El dato mayor es: \n%d\n", datoMayor);
            }
        }
    }

}
