import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testStringComparison() {
        assertNotEquals("hello", "world");
    }
}