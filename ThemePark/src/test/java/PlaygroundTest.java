import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground1;
    private Visitor mike;
    private Visitor simon;


    @Before
    public void before(){
        playground1 = new Playground("Blobby Land");
        mike = new Visitor("Mike", 26, 1.803, 60.00);
        simon = new Visitor("Simon", 14, 1.200, 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Blobby Land",playground1.getName());
    }

    @Test
    public void hasRestrictionNotAllowed() {
        assertEquals(false, playground1.isAllowedTo(mike));
    }

    @Test
    public void hasRestrictionIsAllowed(){
        assertEquals(true, playground1.isAllowedTo(simon));
    }

}
