import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("\t\t\tMenu\n\n1.-Realizar Multiplicacion. \n2.-Realizar Suma.\n3.-Realizar Resta.\n\nIngresa el numero de la opcion deseada: ");
        int option = Sc.nextInt();

        if(option == 1){
            System.out.println("\nM1ultiplicacion\n");
            System.out.println("Ingresa un valor para X: ");
            int X = Sc.nextInt();
            System.out.println("Ingresa un valor para Y: ");
            int Y = Sc.nextInt();
            System.out.println("Resultado: ");
            System.out.println(X*Y);
        } else if (option == 2) {
            System.out.println("\nSuma\n");
            System.out.println("Ingresa un valor para X");
            int X = Sc.nextInt();
            System.out.println("Ingresa un valor para Y");
            int Y = Sc.nextInt();
            System.out.println("Resultado: ");
            System.out.println(X+Y);
        }
        else{
            System.out.println("\nResta\n");
            System.out.println("Ingresa un valor para X: ");
            int X = Sc.nextInt();
            System.out.println("Ingresa un valor para Y: ");
            int Y = Sc.nextInt();
            System.out.println("Resultado: ");
            System.out.println(X-Y);
        }
    }
}