/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int positivos = 0;
        int termino1 = 12;
        int negativos = 0;
        int termino2 = 11;
        int contador = 1;
        int numero;
        String mensaje1 = "";
        String mensaje = "";
        String serie = "S1 = 12-11+24-22+36-33+48-44";
        System.out.print("""
                         Ingrese el numro de terminos a imprimir:
                         """ + serie + "\n--> ");
        numero = entrada.nextInt();
            while (contador <= numero) {
                if (numero%2 == 0) {
                    mensaje = mensaje + "+" + termino1;
                    termino1 = termino1 + 12;
                } else {
                    if (contador % 2 == 1) {
                        mensaje1 = mensaje1 + "-" + termino2;
                        termino2 = termino2 +11;
                        }
                        System.out.printf(mensaje + mensaje1 );
                    }
                }
            }       
    }

