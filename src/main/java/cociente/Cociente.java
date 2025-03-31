package cociente;

/**
 * Clase que hace la multiplicación de dos y tres números (enteros y reales),
 * también la potencia (example 2^2)
 * @author ANDRÉS FELIPE BARRERO BUSTOS
 * @version 1.0.0
 *
 */

public class Cociente {
    private double acumular;

    /**
     * Constructor por defecto de la clase Cociente.
     */
    public Cociente() {
        this.acumular = 0;
    }

    /**
     * método que hace la multiplicación de dos números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @return devuelve la operación de a*b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * método que hace la multiplicación de dos números enteros.
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return devuelve la operación de a*b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * método que hace la multiplicación de tres números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @param c tercer número real.
     * @return la multiplicación de a,b y c.
     */
    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    /**
     * método que calcula la potencia entre dos números.
     * @param base es el número de la potencia.
     * @param exponente al que se elevará la base.
     * @return devuelve el valor de base ^ exponente (ej:2^2).
     */
    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}