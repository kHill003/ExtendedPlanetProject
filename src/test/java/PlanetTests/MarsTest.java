package PlanetTests;

import Planets.Mars;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsTest {
    Mars mars;

    @Before
    public void before() {
        mars = new Mars("Mars", 10000, true);

    }
    @Test
    public void hasName(){
        assertEquals("Mars", mars.getName());
    }
//    @Test I wrote a test that did fail.  I did it on purpose to prove that the method works
//    public void hasNameWillFail(){
//        assertEquals("Jupiter", mars.getName());
//    }
}