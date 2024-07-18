/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bisiesto;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in);
        int year;
        System.out.print("Ingresa un año:");
        year = texto.nextInt();
        if(year%4==0)
        {
            System.out.println("Es bisiesto");
        }else {
            System.out.println("No es bisiesto");
        }

    }
    
}
