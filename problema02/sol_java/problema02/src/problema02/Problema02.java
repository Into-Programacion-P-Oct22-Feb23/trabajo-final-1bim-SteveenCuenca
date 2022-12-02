/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int traje;
        double precioUnitario;
        double subTotal = 0;
        double total = 0;
        double descuento = 0;
        String mensaje = "";
        System.out.println("Ingrese la cantidad de trajes adquiridos");
        traje = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del traje");
        precioUnitario = entrada.nextDouble();
        if (traje == 1) {
            descuento = 20;
            subTotal = precioUnitario;
            descuento = (descuento * precioUnitario) / 100;
            total = subTotal - descuento;
        } else {
            if (traje == 2) {
                descuento = 25;
                subTotal = precioUnitario * traje;
                descuento = (descuento * precioUnitario) / 100;
                total = subTotal - descuento;
            } else {
                if (traje == 3) {
                    descuento = 40;
                    subTotal = precioUnitario * traje;
                    descuento = (descuento * precioUnitario) / 100;
                    total = subTotal - descuento;
                } else {
                    if (traje > 3) {
                        descuento = 50;
                        subTotal = precioUnitario * traje;
                        descuento = (descuento * precioUnitario) / 100;
                        total = subTotal - descuento;
                    }
                }
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("""
                          Trajes comprados:%d
                          El precio unitario es de:%.1f
                          Subtotal:%.1f
                          Descuento:%.1f
                          Total:%.1f
                          """, traje, precioUnitario, subTotal, 
                          descuento, total);
    }
}
