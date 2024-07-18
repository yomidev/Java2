/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugador;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Jugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner(System.in);
        int puntaje,vidas;
        System.out.println("ingresa tu puntaje");
        puntaje = texto.nextInt();
        System.out.println("ingresa vida restantes");
        vidas = texto.nextInt();
        if(puntaje>=10000 && vidas>0){
            System.out.println("avanzas al siguiente nivel");
        }else{
            System.out.println("perdiste");
        } 
    }
    
}
