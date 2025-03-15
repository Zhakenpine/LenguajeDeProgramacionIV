public class Operaciones {
    double resultado;
    double termino1;
    double termino2;
    double termino3;

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

    public double PerimetroTriangulo(double termino1, double termino2, double termino3) {
        resultado = termino1 + termino2 + termino3;
        return resultado;
    }
    public double PerimetroCuadrdo(double termino1) {
        resultado = termino1 * 4;
        return resultado;
    }
    public double PerimetroRectangulo(double termino1, double termino2) {
        resultado = (termino1*2) + (termino2*2);
        return resultado;
    }
    public double PerimetroCirculo(double termino1) {
        resultado = termino1*Math.PI;
        return resultado;
    }

    public double Circunferencia(double termino1) {
        resultado = termino1 * Math.PI;
        return resultado;
    }

    public double Radio(double termino1) {
        resultado = termino1/2;
        return resultado;
    }
}