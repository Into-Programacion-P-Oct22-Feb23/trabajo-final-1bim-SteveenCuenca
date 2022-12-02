/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensaje = "";
        double angulo;
        int contador = 1;
        while(contador <= 3){
            System.out.print("Ingrese el ángulo");
            angulo = entrada.nextDouble();
            contador = contador + 1;
            if (angulo == 90){
                mensaje = String.format("""
                                        El \u00e1ngulo tiene un tama\u00f1o de:
                                        %.0f\tPor lo tanto es rectangulo
                                        """, angulo);
            }else{
                if (angulo > 90 && angulo < 180){
                    mensaje = String.format("""
                                        El \u00e1ngulo tiene un tama\u00f1o de:
                                        %.0f\tPor lo tanto es obtusangulo
                                        """, angulo);
                }else{
                    if(angulo < 90){
                        mensaje = String.format("""
                                        El \u00e1ngulo tiene un tama\u00f1o de:
                                        %.0f\tPor lo tanto es acutangulo
                                        """, angulo);
                    }
                }
            }
        }
        System.out.println("------------------------------------------");
        System.out.print(mensaje);
    }
    
}
