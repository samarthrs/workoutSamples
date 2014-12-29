import org.junit.Test;

import static org.junit.Assert.*;

public class JavaAdderTest {
    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(4, JavaAdder.add(3, 1));
    }
}
