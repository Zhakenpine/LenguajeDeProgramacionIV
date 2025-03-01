import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Operaciones _Operaciones = new Operaciones();

        double n1, n2;



        System.out.print("Operaciones:\n1.- suma\n2.- resta\n3.- multiplicacion\n4.- division\nEscribe la operación deseada: ");
        String operacion = Sc.next();

        switch (operacion) {
            case "suma":
                System.out.print("Ingresa el primer término: ");
                n1 = Sc.nextDouble();
                System.out.print("Ingresa el segundo término: ");
                n2= Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Suma(n1,n2));
                break;
            case "resta":
                System.out.print("Ingresa el primer término: ");
                n1 = Sc.nextDouble();
                System.out.print("Ingresa el segundo término: ");
                n2= Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Resta(n1,n2));
                break;
            case "multiplicacion":
                System.out.print("Ingresa el primer término: ");
                n1 = Sc.nextDouble();
                System.out.print("Ingresa el segundo término: ");
                n2= Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Multiplicacion(n1,n2));
                break;
            case "division":
                System.out.print("Ingresa el primer término: ");
                n1 = Sc.nextDouble();
                System.out.print("Ingresa el segundo término: ");
                n2= Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Division(n1,n2));
                break;
            default:
                System.out.print("Opcion no valida");
        }
    }
}