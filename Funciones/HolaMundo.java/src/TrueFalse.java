import java.util.Scanner;
public class TrueFalse {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
int Numero;
        System.out.println("INGRESE EL NUMERO");
        Numero=Leer.nextInt();
        System.out.println("Es: "+ truefalse(Numero));
    }













    
    /*public static void truefalse(int a){
        if(a>0){
            System.out.println("VERDADERO");
        }else{
            System.out.println("FALSO");
        }
    }*/
    public static boolean truefalse(int a){
        if(a>0){
            return true;
        }else{
            return false;
        }
    }
}
