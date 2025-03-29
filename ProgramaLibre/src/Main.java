//Serie Fibbonacci
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int X = 0;
    int Y = 1;
    int VariableTemp = 0;
    int Opcion;
    Scanner Sc = new Scanner(System.in);

        System.out.print("Escribe cuantos digitos del Fibbonacci quieres: ");
        Opcion = Sc.nextInt();
        System.out.printf("0\n1\n");
        Opcion = Opcion - 2;
        for (int i = 1; i<= Opcion; i++){
            System.out.println(X + Y);
            VariableTemp = X + Y;
            X = Y;
            Y = VariableTemp;

        }
    }
}