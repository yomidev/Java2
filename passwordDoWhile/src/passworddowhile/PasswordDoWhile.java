/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passworddowhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class PasswordDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String password = "password";
        String userPassword;

        do { 
            System.out.println("Ingresa la contraseña: ");
            userPassword = teclado.nextLine();
        } while (!userPassword.equals(password));
        System.out.println("Contraseña correcta");

        String continuar;
    do{
        System.out.println("Numero" + Math.random()*100);
        System.out.println("Quieres continuar S/N");
        continuar = teclado.nextLine();
     }while(!continuar.equals("N"));
    }
    
    
}
