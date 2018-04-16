import Attractions.RollerCoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    private RollerCoaster rollercoaster1;
    private Visitor mike;
    private Visitor simon;

    @Before
    public void before(){
        rollercoaster1 = new RollerCoaster("The Spleen Buster", 6.00);
        mike = new Visitor("Mike", 26, 1.803, 60.00);
        simon = new Visitor("Simon", 14, 1.200, 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("The Spleen Buster",rollercoaster1.getName());
    }

    @Test
    public void hasRestrictionNotAllowed(){
        assertEquals(false, rollercoaster1.isAllowedTo(simon));
    }

    @Test
    public void hasRestrictionIsAllowed(){
        assertEquals(true, rollercoaster1.isAllowedTo(mike));
    }

    @Test
    public void canBeCharged(){
        rollercoaster1.priceFor(mike);
        assertEquals(54.00, mike.getMoney(), 0.001);
    }


}
