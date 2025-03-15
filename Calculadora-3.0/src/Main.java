import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Operaciones _Operaciones = new Operaciones();

        double n1, n2, n3;


        System.out.print("Operaciones:\n1.- suma\n2.- resta\n3.- multiplicacion\n4.- division\n5.-Perimetro\n6.-Circunferencia\n7.-Radio\nEscribe el numero de la operación deseada: ");
        int operacion = Sc.nextInt();
        int Option;

        try {
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
            else if (operacion == 5) {
                System.out.print("Perimetros:\n1.-Tringulo\n2.-Cuadrado\n3.- Rectangulo\n4.-Circulo\nEscribe el numero de la opcion deseada: ");
                Option = Sc.nextInt();
                switch (Option){
                    case 1:
                        System.out.println("Ingresa el primer lado: ");
                        n1 = Sc.nextDouble();
                        System.out.println("Ingresa el segundo lado: ");
                        n2 = Sc.nextDouble();
                        System.out.println("Ingresa el tercer lado: ");
                        n3 = Sc.nextDouble();
                        System.out.println("El resultado es: "+ _Operaciones.PerimetroTriangulo(n1,n2,n3));
                        break;
                    case 2:
                        System.out.println("Ingresa un lado: ");
                        n1 = Sc.nextDouble();
                        System.out.println("El resultado es: "+ _Operaciones.PerimetroCuadrdo(n1));
                        break;
                    case 3:
                        System.out.println("Ingresa el largo de uno de los lados: ");
                        n1 = Sc.nextDouble();
                        System.out.println("Ingresa el ancho de uno de los lados: ");
                        n2 = Sc.nextDouble();
                        System.out.println("El resultado es: "+ _Operaciones.PerimetroRectangulo(n1,n2));
                        break;
                    case 4:
                        System.out.println("Ingresa el diametro: ");
                        n1 = Sc.nextDouble();
                        System.out.println("El resultado es: "+ _Operaciones.PerimetroCirculo(n1));
                        break;

                }
            }
            else if (operacion == 6) {
                System.out.print("Ingresa el diametro: ");
                n1 = Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Circunferencia(n1));
            }
            else if (operacion == 7) {
                System.out.print("Ingresa el diametro: ");
                n1 = Sc.nextDouble();
                System.out.println("El resultado es: " + _Operaciones.Radio(n1));
            }
            else{
                System.out.print("Opcion no valida");
            }
        } catch (Exception e){
            System.out.print("Error: " + e.getMessage());
        }
    }
}