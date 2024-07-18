/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        double suma, resta, mult, div;

        System.out.println("Ingresa el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        num2 = teclado.nextDouble();

        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;

        /*System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+ mult);
        System.out.println("Division: "+ div);*/

        System.out.println("Ingresa el simbolo de la operacion que deseas realizar: ");
        String c = teclado.next();

        /*switch (c) {
            case "+":
                System.out.println("Suma: "+ suma);
            break;
            case "-":
                System.out.println("Resta: "+ resta);
            break;
            case "*":
                System.out.println("Multiplicacion: "+ mult);
            break;
            case "/":
                if(num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                }else{
                    System.out.println("Division: "+ div);
                }
            break;
            default:
                System.out.println("La opcion ingreso no es correcta");
            break;
        }*/

        if(c.equals("+")){
            System.out.println("Suma: "+ suma);
        }else if(c.equals("-")){
            System.out.println("Resta: "+ resta);
        }else if(c.equals("*")){
            System.out.println("Multiplicacion: "+ mult);
        }else if(c.equals("/")){
            if(num2 == 0){
                System.out.println("No se puede dividir entre 0");
            }else{
                System.out.println("Division: "+ div);
            }
        }else{
            System.out.println("La opcion ingreso no es correcta");
        }

        teclado.close();
    }
    
}
