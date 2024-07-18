/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado;
        Scanner teclado = new Scanner(System.in);
        int numero, limite;
        System.out.println("ingresa un numero");
        numero=teclado.nextInt();
        System.out.println("ingresa el limite");
        limite=teclado.nextInt();
        for (int i = 0; i <= limite; i++) {
            resultado=numero*i;
            System.out.println(numero+"x"+i+"="+resultado);
        }
    }
    
}
