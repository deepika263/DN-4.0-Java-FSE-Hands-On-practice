import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals("Addition should work", 5, 2 + 3);
        assertTrue("5 should be greater than 3", 5 > 3);
        assertFalse("5 should not be less than 3", 5 < 3);
        String nullString = null;
        assertNull("Variable should be null", nullString);
        assertNotNull("New object should not be null", new Object());
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame("References should point to same object", obj1, obj2);
    }
    @Test(expected = ArithmeticException.class)
    public void testException() {
        int result = 5 / 0;
    }
}
