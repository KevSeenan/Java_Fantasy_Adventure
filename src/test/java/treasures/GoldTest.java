package treasures;

import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    Gold gold;

    @Before
    public void before(){
        gold = new Gold(40);
    }

    @Test
    public void hasValue() {
        assertEquals(40, gold.getValue());
    }
}
