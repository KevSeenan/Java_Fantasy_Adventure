package treasures;

import org.junit.Before;
import treasure.Gold;

public class GoldTest {

    Gold gold;

    @Before
    public void before(){
        gold = new Gold(40);
    }
}
