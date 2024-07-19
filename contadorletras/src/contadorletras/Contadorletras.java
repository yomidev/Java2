/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorletras;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Contadorletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String Palabra;
        int contador = 0;
        System.out.print("ingresa una palabra");
        Palabra = teclado.nextLine();
        for (int i = 0; i < Palabra.length(); i++) {
            if(Palabra.charAt(i)=='e'){
                contador =contador+ 1;


            }
        }
        System.out.println("el numero de letras e es" + contador);

    }
    
}
