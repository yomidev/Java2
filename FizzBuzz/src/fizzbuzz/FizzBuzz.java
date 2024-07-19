/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int inicio, limite;
        System.out.print("Ingresa el primer valor");
        inicio= teclado.nextInt();
        System.out.print("Ingresa el limite");
        limite= teclado.nextInt();
        /*if(inicio<limite) {
            for (int i = inicio; i <= limite; i++) {
                if (i%5==0&&i%3==0) {
                    System.out.print("fizzbuzz");
                    
                }else if (i%5==0) {
                    System.out.println("buzz");
                }else if (i%3==0) {
                    System.out.println("fizz");
                    
                }else {
                    System.out.println(i);
                }
                
            }
        }else{
            System.out.print("El limte es menor");
        }*/
        while (limite< inicio) {
            System.out.println("ingresa el limite"); 
            limite= teclado.nextInt();
        }
        for (int i = inicio; i <= limite; i++) {
            if (i%5==0&&i%3==0) {
                System.out.print("fizzbuzz");
                
            }else if (i%5==0) {
                System.out.println("buzz");
            }else if (i%3==0) {
                System.out.println("fizz");
                
            }else {
                System.out.println(i);
            }
        }
}
}

