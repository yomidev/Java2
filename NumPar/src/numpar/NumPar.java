/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numpar;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class NumPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int num1;

        System.out.print("ingrese un numero: ");
        num1 = teclado.nextInt();

        if(num1%2==0)
        {
            System.out.print("es par");

        }
        else{
        System.out.print("no es par");
        }


    }
    
}
