public class Operaciones {
    double resultado;
    double termino1;
    double termino2;

    public double Suma(double termino1, double termino2) {
        resultado = termino1 + termino2;
        return resultado;
    }

    public double Resta(double termino1, double termino2) {
        resultado = termino1 - termino2;
        return resultado;
    }

    public double Multiplicacion(double termino1, double termino2) {
        resultado = termino1 * termino2;
        return resultado;
    }

    public double Division(double termino1, double termino2) {
        resultado = termino1 / termino2;
        return resultado;
    }
}