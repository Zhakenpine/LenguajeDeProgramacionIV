import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = Sc.nextInt();

        if(numero == 10){
            System.out.println("Numero igual a 10");
        } else if (numero>10) {
            System.out.println("Numero mayor a 10");
        }
        else {
            System.out.println("Numero menor a 10");
        }
    }
}