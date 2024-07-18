/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma100;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Suma100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, suma=0;
        System.out.println("ingresa un numero");
        num1=teclado.nextInt();
        /*while (suma<100) { 
            suma=suma+num1;
            System.out.println("ingresa un numero");
        num1=teclado.nextInt();
        }
        System.out.println("la suma llego a 100");
            
        }*/
        do { System.out.println("ingresa un numero"); 
        num1=teclado.nextInt();
        suma=suma+num1;
        } while (suma==100);
        System.out.println("la suma ya llego a 100");
    }
}
    

