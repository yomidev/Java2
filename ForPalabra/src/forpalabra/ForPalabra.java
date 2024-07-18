/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forpalabra;

import java.util.Scanner;

public class ForPalabra {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String palabra;
        int limite; 
        System.out.println("ingresa una palabra");
        palabra = teclado.nextLine();
        System.out.println("ingresa el numero de veces");
        limite = teclado.nextInt();
        for (int i = 1; i <= limite; i++) {
System.out.println(palabra);
            
        }
    }
    
}
