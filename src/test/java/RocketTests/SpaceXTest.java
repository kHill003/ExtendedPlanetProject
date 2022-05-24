package RocketTests;

import Planets.Mars;
import Rockets.SpaceX;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceXTest {
    SpaceX spaceX;
  @Before
   public void before() {
    spaceX = new SpaceX("SpaceX", 5);

    }
    @Test
    public void hasName(){
        assertEquals("SpaceX", spaceX.getName());
    }
//    @Test  correct.  This test fails.  It should fail
//    public void hasNameFail(){
//        assertEquals("Snoopy", spaceX.getName());
//    }
}
