package suma;

/**
 * La clase suma, realiza la adición de dos o tres números reales o enteros.
 * @author ANDRÉS FELIPE BARRERO BUSTOS
 * @version 1.0.0
 */

public class Suma {
    private double acumular;

    /**
     * Constructor por defecto de la clase Suma
     */
    public Suma () {
        this.acumular = 0;
    }

    /**
     * Realiza la suma de dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b){
        return a + b;
    }

    /**
     * Realiza la suma de dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza la suma de tres números enteros.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return La suma de a, b y c.
     */
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }


    /**
     * Agrega un valor al acumulado de la calculadora.
     *
     * @param valor Valor que se sumará al acumulado.
     */
    public void sumarAcumulado(double valor) {
        this.acumular += valor;
    }

    /**
     * Obtiene el valor acumulado de la calculadora.
     *
     * @return El valor acumulado actual.
     */
    public double getAcumulado() {
        return this.acumular;
    }

}
