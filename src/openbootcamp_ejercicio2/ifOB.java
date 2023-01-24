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
public class ifOB {
    public static void main(String[] args) {
        int numeroIf;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Ingresa el primer  valor entero: ");
        numeroIf = scan.nextInt();

        if(numeroIf>0){
           System.out.println("El numero es positivo "+ numeroIf); 
        }
        else if(numeroIf<0){
        System.out.println("El numero es negativo "+ numeroIf);
        }
        else System.out.println("El valor ingresado es : "+ numeroIf);
    }
}
