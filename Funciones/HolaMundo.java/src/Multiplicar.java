import java.util.Scanner;
public class Multiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime los numeros 1 y 2 =");
        float a = teclado.nextFloat();
        float b = teclado.nextFloat();

        multiplicar(a, b);

    }
    public static void multiplicar (float a, float b){
        float R=a*b;
        System.out.println("El resultado es:" + R);
    }
}
