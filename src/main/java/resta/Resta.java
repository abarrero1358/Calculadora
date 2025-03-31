package resta;

/**
 * La clase Resta proporciona métodos para restar dos o tres números,
 * admitiendo tanto valores enteros como reales.
 * @author ANDRÉS FELIPE BARRERO BUSTOS
 * @version 1.0.0
 */


public class Resta {
    private double acumular;

    /**
     * Constructor por defecto de la clase Resta
     */
    public Resta () {this.acumular = 0;}

    /**
     * Realiza la resta de dos números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @return la resta de a y b.
     */
    public double restar (double a, double b) {
        return a - b;
    }

    /**
     * Realiza la resta de dos números enteros.
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return la resta de a y b.
     */
    public int restar (int a, int b) {
        return a - b;
    }

    /**
     * Realiza la resta de tres números reales
     * @param a primer número real.
     * @param b segundo número real.
     * @param c tercer número real.
     * @return la resta de a, b y c.
     */
    public double restar (double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Agrega un valor acumulado a la calculadora.
     * @param valor
     */
    public void restarAcumulado(double valor) {
        this.acumular += valor;
    }

    /**
     * Obtiene el valor acumulado de la resta
     * @return el valor acumulado actual
     */
    public double getAcumular() {
        return this.acumular;
    }

}
