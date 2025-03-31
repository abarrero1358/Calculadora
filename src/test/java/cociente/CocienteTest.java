package cociente;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * pruebas unitarias de la clase Cociente.
 */

class CocienteTest {

    /**
     * prueba la multiplicación de dos números reales.
     */
    @Test
    void testMultiplicarDosReales() {
        Cociente cociente = new Cociente();
        assertEquals(6.25, cociente.multiplicar(2.5, 2.5), 0.0001);
    }

    /**
     * prueba la multiplicación de dos números enteros.
     */
    @Test
    void testMultiplicarDosEnteros() {
        Cociente cociente = new Cociente();
        assertEquals(6, cociente.multiplicar(2, 3), 0.0001);
    }

    /**
     * prueba la multiplicación de tres números reales.
     */
    @Test
    void testMultiplicarTresReales() {
        Cociente cociente = new Cociente();
        assertEquals(15.625, cociente.multiplicar(2.5, 2.5, 2.5), 0.0001);
    }
    /**
     * prueba el calculo de la potencia de un número.
     */
    @Test
    void testCalcularPotencia() {
        Cociente cociente = new Cociente();
        assertEquals(8, cociente.calcularPotencia(2, 3), 0.0001);
    }
}