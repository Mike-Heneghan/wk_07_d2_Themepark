import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodge1;
    private Visitor mike;
    private Visitor simon;

    @Before
    public void before(){
        dodge1 = new Dodgems("The Spine Splitter", 6.00);
        mike = new Visitor("Mike", 26, 1.803, 60.00);
        simon = new Visitor("Simon", 11, 1.200, 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("The Spine Splitter",dodge1.getName());
    }

    @Test
    public void canBeChargedUnder12(){
        assertEquals(3.00, dodge1.priceFor(simon), 0.001);
        assertEquals(47.00, simon.getMoney(), 0.001);
    }

    @Test
    public void canBeChargedOver12(){
        assertEquals(6.00, dodge1.priceFor(mike), 0.001);
        assertEquals(54.00, mike.getMoney(), 0.001);
    }
}
