import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de tipos de arrays
        //Ejemplos
        int [] numeros = {123, 342, 20, 10, 23, 19, 69, 72, 1000};
        String [] anime;
        anime = new String[10];
        String [] kpop = { "BLACKPINK", "STRAY KIDS", "TWICE", "(G)I-DLE", "NEWJEANS",
                "TOMORROW x TOGETHER", "ENHYPEN", "BTS", " ", "SEVENTEEN", " ", " ", "REDVELVET",
                " ","LE SSERAFIM"
        };
        String[] songs;


        //String
        String other;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < kpop.length; i++) {
            String grupoActual = kpop[i];
            if (grupoActual.equals(" ")) {
                System.out.println("Ingrese otro grupo: ");
                other = teclado.nextLine();
                kpop[i] = other;
            }   
        }
        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        String integrantes;
        for (int i = 0; i < kpop.length; i++) {
            System.out.println("Ingresa tu bias " + kpop[i]+ ": ");
            integrantes = teclado.nextLine();
            kpop[i] = kpop[i].concat(" - ").concat(integrantes);
        }

        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        String canciones;
        for (int i = 0; i < kpop.length; i++) {
            System.out.println("Ingresa tu cancion favorita de " + kpop[i]+ ": ");
            canciones = teclado.nextLine();
            kpop[i] = kpop[i].concat(" - ").concat(canciones);
        }

        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        //Numero menor
        /*int minimo = numeros[0];
        for (int i = 0; i< numeros.length; i++) {
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }
        }
        int suma = 0;
        for(int j = 0; j< numeros.length; j++){
            suma = suma + numeros[j];
        }
        int [] invertido = new int[numeros.length];
        for (int k = 0; k < numeros.length; k++) {
            invertido[k] = numeros[numeros.length -1 -k];
        }

        double promedio = suma/numeros.length;
        System.out.println("El promedio es: "+ promedio);
        System.out.println("El numero menor: " + minimo);
        System.out.println("Array Invertido: "+ Arrays.toString(invertido));*/
    }
}
