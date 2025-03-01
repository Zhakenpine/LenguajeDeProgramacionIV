import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Operaciones _Operaciones = new Operaciones();

        double n1, n2;


        System.out.print("Operaciones:\n1.- suma\n2.- resta\n3.- multiplicacion\n4.- division\nEscribe el numero de la operación deseada: ");
        int operacion = Sc.nextInt();


        if (operacion == 1) {
            System.out.print("Ingresa el primer término: ");
            n1 = Sc.nextDouble();
            System.out.print("Ingresa el segundo término: ");
            n2 = Sc.nextDouble();
            System.out.println("El resultado es: " + _Operaciones.Suma(n1, n2));
        }
        else if (operacion == 2) {
            System.out.print("Ingresa el primer término: ");
            n1 = Sc.nextDouble();
            System.out.print("Ingresa el segundo término: ");
            n2 = Sc.nextDouble();
            System.out.println("El resultado es: " + _Operaciones.Resta(n1, n2));
        }
        else if (operacion == 3) {
            System.out.print("Ingresa el primer término: ");
            n1 = Sc.nextDouble();
            System.out.print("Ingresa el segundo término: ");
            n2 = Sc.nextDouble();
            System.out.println("El resultado es: " + _Operaciones.Multiplicacion(n1, n2));
        }
        else if (operacion == 4) {
            System.out.print("Ingresa el primer término: ");
            n1 = Sc.nextDouble();
            System.out.print("Ingresa el segundo término: ");
            n2 = Sc.nextDouble();
            System.out.println("El resultado es: " + _Operaciones.Division(n1, n2));
        }
        else{
                System.out.print("Opcion no valida");
        }
    }
}