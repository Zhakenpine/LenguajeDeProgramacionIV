import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("\t\t\tMenu\n\n- multiplicacion\n- suma\n- resta\n\nIngresa la operacion deseada: ");
        String opcion = Sc.nextLine();
        int X,Y; //
        switch (opcion) {
            case "multiplicacion":
                System.out.println("\nMultiplicacion\n");
                System.out.println("Ingresa un valor para X: ");
                X = Sc.nextInt();
                System.out.println("Ingresa un valor para Y: ");
                Y = Sc.nextInt();
                System.out.println("Resultado: ");
                System.out.println(X * Y);
                break;
            case "suma":
                System.out.println("\nSuma\n");
                System.out.println("Ingresa un valor para X: ");
                X = Sc.nextInt();
                System.out.println("Ingresa un valor para Y: ");
                Y = Sc.nextInt();
                System.out.println("Resultado: ");
                System.out.println(X + Y);
                break;
            case "resta":
                System.out.println("\nResta\n");
                System.out.println("Ingresa un valor para X: ");
                X = Sc.nextInt();
                System.out.println("Ingresa un valor para Y: ");
                Y = Sc.nextInt();
                System.out.println("Resultado: ");
                System.out.println(X - Y);
                break;
            default:
                System.out.println("\nOpción no válida.");
                break;
        }

    }
}