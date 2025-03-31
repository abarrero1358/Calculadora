package suma;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Suma.
 * Se verifican las operaciones de suma y acumulado.
 *
 * @author ANDRÉS FELIPE BARRERO BUSTOS
 * @version 1.0.0
 */
public class SumaTest {
    private Suma suma;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    /**
     * Prueba para la suma de dos números reales.
     */
    @Test
    void testSumarReales() {
        assertEquals(5.5, suma.sumar(2.2, 3.3), 0.001);
    }

    /**
     * Prueba para la suma de dos números enteros.
     */
    @Test
    void testSumarEnteros() {
        assertEquals(8, suma.sumar(3, 5));
    }

    /**
     * Prueba para la suma de tres números reales.
     */
    @Test
    void testSumarTresReales() {
        assertEquals(6.6, suma.sumar(1.1, 2.2, 3.3), 0.001);
    }

    /**
     * Prueba para la suma acumulada.
     */
    @Test
    void testSumaAcumulada() {
        suma.sumarAcumulado(5);
        suma.sumarAcumulado(10);
        assertEquals(15, suma.getAcumulado(), 0.001);
    }
}
