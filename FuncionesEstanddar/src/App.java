
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Math
        System.out.println("Valor Absoluto: "+ Math.abs(-123));
        System.out.println("Exponente: " + Math.pow(10,2));
        System.out.println("Raiz Cuadrada: "+ Math.sqrt(1000002));
        System.out.println("Maximo: "+ Math.max(2024, 1000003));
        System.out.println("Minimo" + Math.min(1000004, -8));
        System.out.println("Random: "+ Math.random());

        //String
        System.out.println("\n");
        String cadena = "Hola adios coyeye cheel chevere, caracoles, repampanos, recorcholis chimichurri demonios among us";
        System.out.println("Longitud: "+ cadena.length());
        System.out.println("Substrinf: "+ cadena.substring(30));
        System.out.println("IndexOf: "+ cadena.indexOf("repampanos"));
        System.out.println("Remplazar: "+ cadena.replace(',','-'));
        System.out.println("Mayusculas: "+ cadena.toUpperCase());
        System.out.println("Trim: "+cadena.trim());

        //
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingresa una palabra");
        String palabra=teclado.nextLine();
        System.out.println("Remplazar: "+ palabra.replace('n','y'));
        palabra= palabra.replaceAll(" ", "").trim();
        String invertida = "";
        for (int i = palabra.length()-1; i >= 0;i--) {
            invertida = invertida+palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: "+ invertida);
        //StringBuilder
        System.out.println("Ingrese otra palabra");
        String palabra2 = teclado.nextLine();
        StringBuilder sb = new StringBuilder(palabra2);
        String inv2 = sb.reverse().toString().replaceAll(" ", "").trim();
        System.out.println("La cadena invertida es: "+ inv2);
        teclado.close();
    }
}
