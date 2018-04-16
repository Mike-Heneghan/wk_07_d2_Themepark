import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    private Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor("Mike", 26, 1.803, 60.00 );
    }

    @Test
    public void hasName(){
        assertEquals("Mike",visitor1.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(26, visitor1.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.803, visitor1.getHeight(), 0.001);
    }

    @Test
    public void hasMoney(){
        assertEquals(60.00, visitor1.getMoney(), 0.001);
    }


}
