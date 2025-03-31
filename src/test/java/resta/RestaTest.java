package resta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Resta.
 */
class RestaTest {

    /**
     * Prueba el método restar(double, double).
     * Se verifica que la resta de dos números reales es correcta.
     */
    @Test
    void testRestarDosReales() {
        Resta resta = new Resta();
        assertEquals(2.5, resta.restar(5.5, 3.0), 0.0001);
    }

    /**
     * Prueba el método restar(int, int).
     * Se verifica que la resta de dos números enteros es correcta.
     */
    @Test
    void testRestarDosEnteros() {
        Resta resta = new Resta();
        assertEquals(7, resta.restar(10, 3));
    }

    /**
     * Prueba el método restar(double, double, double).
     * Se verifica que la resta de tres números reales es correcta.
     */
    @Test
    void testRestarTresReales() {
        Resta resta = new Resta();
        assertEquals(4.0, resta.restar(10.0, 3.0, 3.0), 0.0001);
    }

    /**
     * Prueba el método restarAcumulado(double).
     * Se verifica que el valor acumulado se actualiza correctamente.
     */
    @Test
    void testRestarAcumulado() {
        Resta resta = new Resta();
        resta.restarAcumulado(5);
        resta.restarAcumulado(-3);
        assertEquals(2.0, resta.getAcumular(), 0.0001);
    }

    /**
     * Prueba el método getAcumular().
     * Se verifica que el valor acumulado inicial es 0.
     */
    @Test
    void testGetAcumularInicial() {
        Resta resta = new Resta();
        assertEquals(0.0, resta.getAcumular(), 0.0001);
    }
}
