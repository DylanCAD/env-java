import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        assertEquals(8, a + b, "L'addition devrait être 8");
    }
}