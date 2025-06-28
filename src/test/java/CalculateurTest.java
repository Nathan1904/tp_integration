import org.example.Calculateur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateurTest {

    @Test
    void additionFonctionne() {
        Calculateur calc = new Calculateur();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void soustractionFonctionne() {
        Calculateur calc = new Calculateur();
        assertEquals(1, calc.substract(5, 4));
    }

    @Test
    void multiplicationFonctionne() {
        Calculateur calc = new Calculateur();
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    void divisionFonctionne() {
        Calculateur calc = new Calculateur();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void divisionParZeroLanceException() {
        Calculateur calc = new Calculateur();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    void testIsEvenVrai() {
        Calculateur calc = new Calculateur();
        assertTrue(calc.isEven(4));
    }

    @Test
    void testIsEvenFaux() {
        Calculateur calc = new Calculateur();
        assertFalse(calc.isEven(3));
    }
}