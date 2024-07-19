/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int Random =(int)(Math.random()*100);
        System.out.println("Ingrese el numero: ");
        int Num = teclado.nextInt();
        while(Num!=Random) {
            System.out.println("Ingrese el numero:");
            Num = teclado.nextInt();

        }
        System.out.println("Adivinaste el numero");

    }
    
}
