/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package noprimitivos;

/**
 *
 * @author Yomi
 */
public class NoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Cadenas de Texto
        String texto = "Hola, como estas?";
        int a = 20;
        System.out.println(texto + " Numero de caracteres: " + texto.length()
        + "Minusculas: "+ texto.toLowerCase()+ "Mayusculas: "+ texto.toUpperCase());

        int [] array = {1,3,5,7,9,0};
        char [] array2 = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Primer numero: "+ array[0]);
        System.out.println("Ultimo numero: " + array[10]);
    }
    
}
