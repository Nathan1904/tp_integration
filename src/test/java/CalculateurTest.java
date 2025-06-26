import org.example.Calculateur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateurTest {

    @Test
    void additionFonctionne() {
        Calculateur calc = new Calculateur();
        assertEquals(4, calc.add(2, 2));
    }
}
