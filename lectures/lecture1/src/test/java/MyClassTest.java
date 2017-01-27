import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest
{
    @Test
    public void testGetInt()
    {
        final MyClass mc = new MyClass();
        assertEquals(mc.getInt(), 5);
    }
}
