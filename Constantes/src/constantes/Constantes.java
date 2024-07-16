/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constantes;

/**
 *
 * @author Yomi
 */
import java.util.*;

public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final double PI = 3.141516; // Valor de Pi
        float radio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la medida del radio: ");
        radio = teclado.nextFloat();

        double area = PI*(Math.pow(radio, 2));

        System.out.println("El area del circulo es: "+ area);

    }
    
}
