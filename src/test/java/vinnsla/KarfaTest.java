package vinnsla;

import is.vinnsla.Karfa;
import is.vinnsla.Veitingar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class KarfaTest {
    int a;
    int b;
    // Every class in our project has a GUI component so we do not have the knowledge to test them.
    // However to show that we are familiar with JUnit testing we made some examples of test.
    @Test
    public void testExampleOne() {
        a = 100;
        b = 100;
        assertEquals(a,b);
    }
    @Test
    public void testExampleTwo(){
        a = 29;
        b = 31;
        assertFalse(a == b);
    }
}
