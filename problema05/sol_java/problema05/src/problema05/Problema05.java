/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int valorX;
        int valorY;
        System.out.println("Ingrese el valor de X");
        valorX = entrada.nextInt();
        System.out.println("Ingrese el valor de Y");
        valorY = entrada.nextInt();
        if (valorX > 0 && valorY >0){
            System.out.println("---------------------------");
            System.out.println("Está en el primer cuadrante");
        }else{
            if(valorX < 0 && valorY >0){
                System.out.println("---------------------------");
                System.out.println("Está en el segundo cuadrante");
            }else{
                if (valorX <0 && valorY < 0){
                    System.out.println("---------------------------");
                    System.out.println("Está en el trecer cuadranate");
                }else{
                    if (valorX > 0 && valorY < 0){
                        System.out.println("---------------------------");
                        System.out.println("Está en el cuarto cuadrante");
                    }
                }                
            }
        }
    }
    
}
