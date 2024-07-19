/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabrawhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Palabrawhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String abc;
        System.out.print("Ingresa una palabra");
        abc=teclado.nextLine();
        while (true) { 
            if (abc.equals("Salir")) {
              break;  
            }else{
                System.out.print("Ingresa una palabra");
                abc=teclado.nextLine();
            }
        }
    }
    
}
