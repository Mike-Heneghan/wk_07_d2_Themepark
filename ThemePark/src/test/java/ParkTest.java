import Park.Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park1;

    @Before
    public void before(){
        park1 =  new Park("The Great Outdoors", 6);
    }

    @Test
    public void canAssert(){
        assertEquals("The Great Outdoors",park1.getName());
    }

}
