import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        holaMundo();
        System.out.println(holaMundoCadena());
        System.out.println(saludo(nombre, 10));
        int a = 3;
        Math.pow(a,3);
    }

    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    public static String holaMundoCadena(){
        //String hola = "Hola Mundo";
        //return hola;
        return "Hola Mundo";
    }

    public static String saludo(String a, int x){
        return "Hola " + a;
    }

}
