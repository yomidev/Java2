/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradofor;

/**
 *
 * @author Yomi
 */
public class CuadradoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i <= 50; i++) {
            System.out.println("Numero: "+ i+ " Cuadrado: "+ (i*i));
            System.out.println("Numero: "+ i+ " Cubo: "+ (Math.pow(i, 3)));
        }
    }
    
}
