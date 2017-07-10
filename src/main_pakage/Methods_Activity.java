/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_pakage;

/**
 *
 * @author luis
 */
public class Methods_Activity {

    //Metodo constructor
    public Methods_Activity() {
        
    }
    
    /* Metodo punto 6: Determinar false o true según la operación 
    * - NOT((a > 10) AND (a < 20)
    * 
    * Donde a=33
    */
    
    public void HallarFalsoOVerdadero () {
        int a = 33;
        boolean op = !((a > 10) && (a < 20));
        System.out.println("La operación NOT((a > 10) AND (a < 20) es: " + op + "\n");
    }
    
    /* Metodo punto 7: Hallar el valor de verdad de las siguientes expresiones
    * - ((a > b) OR (a < c)) AND ((a = c) OR (a >= b))
    * - ((a >= b) OR (a < d)) AND ((a >= d) AND (c > d))
    * - NOT (a = c) AND (c > b)
    *
    * Donde a=10, b=12, c=13, d=10
    */
    public void HallarValorVerdad1 () {
        int a = 10, b = 12, c = 13, d = 10;
        boolean op1 = ((a > b) || (a < c)) && ((a == c) || (a >= b));
        System.out.println("El valor de verdad de ((a > b) OR (a < c)) AND ((a = c) OR (a >= b)) es: " + op1);
        boolean op2 = ((a >= b) || (a < d)) && ((a >= d) && (c > d));
        System.out.println("El valor de verdad de ((a >= b) OR (a < d)) AND ((a >= d) AND (c > d)) es: " + op2);
        boolean op3 = !(a == c) && (c > b);
        System.out.println("El valor de verdad de NOT (a = c) AND (c > b) es: " + op3 + "\n");
    }

    /* Metodo punto 8: Devolver valor verdad de la siguiente expresión
    * - NOT((m > n AND r > 5) OR (NOT(t < v AND s > m))
    * 
    * Donde m=8, n=9, r=5, s=5, t=4, v=7
    */
    public void HallarValorVerdad2 () {
        int m = 8, n = 9, r = 5, s = 5, t = 4, v = 7;
        boolean op = !((m > n && r > 5) || (!(t < v && s > m)));
        System.out.println("El valor de verdad de NOT((m > n AND r > 5) OR (NOT(t < v AND s > m)) es: " + op + "\n");
    }
    
    //Metodo punto 9: Determinar si un numero es 0, positivo ó negativo
    public void ObtenerTipoNumero (int num) {        
        if (num > 0)
            System.out.println(num + " es un número entero positivo");
        else if (num < 0)
            System.out.println(num + " es un número entero negativo");
        else
            System.out.println("el número entero es cero" + "\n");
    }
}
