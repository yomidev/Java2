/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumawhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class SumaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero, suma=0;
        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();
        while(numero >= 0){
            suma = suma + numero;
            //suma += numero;
            System.out.println("Ingresa un numero");
            numero = teclado.nextInt();
        }

        System.out.println("La suma es: "+ suma);
    }
    
}
