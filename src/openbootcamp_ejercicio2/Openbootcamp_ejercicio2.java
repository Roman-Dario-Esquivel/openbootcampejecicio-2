/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcamp_ejercicio2;

import java.util.Scanner;




/**
 *
 * @author esqui
 */
public class Openbootcamp_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var  estacion ="VERANO"; 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Ingresa una estacion del año en mayusculas para salir SALIR /n Ingrso: ");
        estacion = scan.next();
        switch(estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
                case "INVIERNO":
                System.out.println("Es invierno");
                break;
                case "OTOÑO":
                System.out.println("Es otoño");
                break;
                case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
            }
      
      
    }
}
