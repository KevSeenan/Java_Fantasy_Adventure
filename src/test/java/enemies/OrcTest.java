package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    Orc orc;

    @Before
    public void before(){
        orc = new Orc ();
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, orc.getHp());
    }

    @Test
    public void canReduceHP() {
        orc.reduceHP(10);
        assertEquals(90, orc.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        orc.reduceHP(150);
        assertEquals(0, orc.getHp());
    }
}
