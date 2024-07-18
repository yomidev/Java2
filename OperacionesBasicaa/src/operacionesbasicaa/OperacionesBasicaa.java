/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicaa;

/**
 *
 * @author Yomi
 */
public class OperacionesBasicaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Basicas

        double a = Math.random()*100;
        double b = Math.random()*100;

        double suma, resta, multiplicacion, division, residuo;

        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        division = a/b;
        residuo = a%b;


        System.out.println(a);
        System.out.println(b);
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+ multiplicacion);
        System.out.println("Division: "+ division);
        System.out.println("Residuo: "+ residuo);

        //Asignacion
        double suma2 = a+=b;//a = a +b;
        double resta2 = a-=b;
        double multiplicacion2 = a*=b;
        double division2 = a/=b;
        double residuo2 = a%=b;
        System.out.println("\n");
        System.out.println("Suma Asignacion: "+ suma2);
        System.out.println("Resta Asignacion: "+ resta2);
        System.out.println("Multiplicacion Asignacion: "+ multiplicacion2);
        System.out.println("Division Asignacion: "+ division2);
        System.out.println("Residuo Asignacion: "+ residuo2);

        double incremento = a++;
        double decremento = b--;

        System.out.println("\n");
        System.out.println("Incremento: "+ incremento);
        System.out.println("Decremento: "+ decremento);

        //Relacionales
        boolean identico = (a==b);
        boolean diferente = (a!=b);
        boolean mayorque = (a>b);
        boolean menorque = (a<b);
        boolean mayorigual = (a>=b);
        boolean menorigual = (a<=b);
        System.out.println("\n");
        System.out.println("Identico: "+ identico);
        System.out.println("Diferente: "+ diferente);
        System.out.println("Mayor que: "+ mayorque);
        System.out.println("Menor que: " + menorque);
        System.out.println("Mayor igual que: "+ mayorigual);
        System.out.println("Menor igual que: "+ menorigual);

        //Operaciones Logicas
        boolean and = (a>b && b<a);
        boolean or = (a>b || b>a);
        boolean not = !(a>b);

        System.out.println("\n");
        System.out.println("AND: "+ and);
        System.out.println("OR:" + or);
        System.out.println("NOT: "+ not);

    }
}
