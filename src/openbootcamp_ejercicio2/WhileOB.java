/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openbootcamp_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author esqui
 */
public class WhileOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroWhile;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Ingresa el primer  valor entero menor a 3: ");
        numeroWhile= scan.nextInt();
        while(numeroWhile<3){
            System.out.println("El valor de numero es: " + numeroWhile);
            numeroWhile++;
        }
      
    }
}
