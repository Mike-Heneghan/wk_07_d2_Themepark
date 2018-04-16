import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor mike;
    private Visitor simon;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Cancer Sticks", "El Diablo", 10);
        mike = new Visitor("Mike", 26, 1.803, 60.00);
        simon = new Visitor("Simon", 14, 1.200, 50.00);
    }

    @Test
    public void hasRestrctionAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(mike));
    }

    @Test
    public void hasRestrictionNotAllowed(){
        assertEquals(false, tobaccoStall.isAllowedTo(simon));
    }

}
