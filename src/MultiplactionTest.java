import junit.framework.TestCase;

public class MultiplactionTest extends TestCase {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
