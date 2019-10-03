package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    
    Troll troll;
    
    @Before
    public void before(){
        troll = new Troll ();
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, troll.getHp());
    }

    @Test
    public void canReduceHP() {
        troll.reduceHP(10);
        assertEquals(90, troll.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        troll.reduceHP(150);
        assertEquals(0, troll.getHp());
    }
}
