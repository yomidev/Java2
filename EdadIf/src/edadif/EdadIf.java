/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadif;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class EdadIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final int MAX_EDAD= 100; 
        Scanner a =new Scanner(System.in);
        int edad;
        System.out.print("Ingresa tu edad: ");
        edad = a.nextInt();
        if (edad >=0 && edad <= 12) {
            System.out.print(" Es niño");
        }else if(edad >=13 && edad<=17){
            System.out.print("Es adolecente");
        }else if(edad >= 18 && edad <=59){
        System.out.println("Es adulto");
        }else{
            if(edad>MAX_EDAD){
                System.out.println("edad no valida");
            }else{
                System.out.println("Es Adulto Mayor");
            }
           
        }
    }
    
}
