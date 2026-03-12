/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Compra_Cliente {

    public static void main(String[] args) {
        String cliente;
        double compra1, compra2, compra3, TotalCompra, PromedioCompra, MayorCompra;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = lectura.nextLine();
        System.out.print("Ingresar compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingresar compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingresar compra 3: ");
        compra3 = lectura.nextDouble();
        TotalCompra = compra1 + compra2 + compra3;
        PromedioCompra = (compra1 + compra2 + compra3) / 3;
        // Calcular la compra máxima
        MayorCompra = compra1;
        if (compra2 > MayorCompra) {
            MayorCompra = compra2;
        }
        if (compra3 > MayorCompra) {
            MayorCompra = compra3;
        }
        System.out.println("\nCliente: " + cliente);
        System.out.println("El total de compra es: " + TotalCompra);
        System.out.println("El promedio de compra es: " + PromedioCompra);
        System.out.println("La compra maxima es: " + MayorCompra);
        lectura.close();
    }
}
