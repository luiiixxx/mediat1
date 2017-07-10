/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_pakage;;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creando sc objeto tipo Scanner
        Scanner sc =new Scanner(System.in);
        
        //Creando objeto ma tipo Methods_Activity
        Methods_Activity ma =new Methods_Activity();
        
        //Llamando metodo 6: HallarFalsoOVerdadero
        System.out.println("Punto #6 del taller");
        ma.HallarFalsoOVerdadero();
        
        //Llamando metodo 7: HallarValorVerdad1
        System.out.println("Punto #7 del taller");
        ma.HallarValorVerdad1();
        
        //Llamando metodo 8: HallarValorVerdad2
        System.out.println("Punto #8 del taller");
        ma.HallarValorVerdad2();
        
        //Llamando metodo 9: ObtenerTipoNumero
        System.out.println("Punto #9 del taller");
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        ma.ObtenerTipoNumero(num);
    }
}
