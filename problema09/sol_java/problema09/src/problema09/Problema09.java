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
        int numero;
        int contador = 1;
        int positivos = 0;
        int terminoPositivo = 12;
        int negativos = 0;
        int terminoNegativo= -11;
        String mensaje = "";
        String serie = "S1=12-11+24-22+36-33+48-44";
        System.out.printf("""
                          Cuál es el número de términos que desea imprimir de
                          la serie:
                          %s
                          """, serie);
        numero = entrada.nextInt();
        if (numero <=8){
            while (contador <= numero){
                if (numero == 1){
                    mensaje = mensaje + terminoPositivo;
                }else{
                    if(contador 2 == 1){
                    
                }
                }
            }
        }
    }
    
}
