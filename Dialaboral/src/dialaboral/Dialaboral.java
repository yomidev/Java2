/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialaboral;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Dialaboral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner (System.in);
        String dia;
        System.out.println("ingresa un dia");
        dia = texto.nextLine();
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("es laboral");
                break;
                case "martes":
                System.out.println("es laboral");
                break;
                case "miercoles":
                System.out.println("es laboral");
                break;
                case "jueves":
                System.out.println("es laboral");
                break;
                case "viernes":
                System.out.println("es laboral");
                break;
                case "sabado":
                System.out.println("es fin de semana");
                break;
                case "domingo":
                System.out.println("es fin de semana");
                break;
            default:
                System.out.println("la opcion no existe");
                break;
        }
    }
    
}
