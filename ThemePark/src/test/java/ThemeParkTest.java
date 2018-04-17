import Park.Attractions.Dodgems;
import Park.Attractions.Park;
import Park.Attractions.Playground;
import Park.Attractions.RollerCoaster;
import Park.Stalls.TobaccoStall;
import Park.ThemePark;
import Park.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark1;
    private Park park1;
    private Dodgems dodge1;
    private TobaccoStall tobaccoStall;
    private Visitor mike;
    private Visitor simon;
    private Playground playground1;
    private RollerCoaster rollercoaster1;


    @Before
    public void before(){
        themepark1 = new ThemePark("Simon's crazy land.");
        park1 =  new Park("The Great Outdoors", 6);
        dodge1 = new Dodgems("The Spine Splitter", 9, 6.00);
        tobaccoStall = new TobaccoStall("Cancer Sticks", "El Diablo", 10, 10.00, 0);
        mike = new Visitor("Mike", 26, 1.803, 60.00);
        simon = new Visitor("Simon", 11, 1.200, 50.00);
        playground1 = new Playground("Blobby Land", 8);
        rollercoaster1 = new RollerCoaster("The Spleen Buster",10,  6.00);

    }

    @Test
    public void hasName(){
        assertEquals("Simon's crazy land.",themepark1.getName());
    }

    @Test
    public void hasFunThings(){
        themepark1.addFunThing(park1);
        themepark1.addFunThing(dodge1);
        themepark1.addFunThing(tobaccoStall);
        themepark1.addFunThing(playground1);
        themepark1.addFunThing(rollercoaster1);
        assertEquals(5, themepark1.getFunThings().size());
    }

    @Test
    public void hasFunThingsString(){
        themepark1.addFunThing(park1);
        themepark1.addFunThing(dodge1);
        themepark1.addFunThing(tobaccoStall);
        themepark1.addFunThing(playground1);
        themepark1.addFunThing(rollercoaster1);
        assertEquals("The Great Outdoors : 6, The Spine Splitter : 9, Cancer Sticks : 0, Blobby Land : 8, The Spleen Buster : 10, ", themepark1.getRatingsString());
    }

}
