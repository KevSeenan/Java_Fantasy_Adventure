import creatures.Dragon;
import creatures.Ogre;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Ogre ogre;
    Dragon dragon;

    @Before
    public void Warlock() {
        ogre = new Ogre ();
        dragon = new Dragon();
        warlock = new Warlock (Spell.FIREBALL, "Voldermort", ogre);
    }

    @Test
    public void hasAName(){
        assertEquals("Voldermort", warlock.getName());
    }

    @Test
    public void canGetSpell() {
        assertEquals(Spell.FIREBALL, warlock.getSelectedItem());
        assertEquals(10, warlock.getSelectedItem().getValue());
    }

    @Test
    public void canChangeSpell() {
        warlock.changeSpell(Spell.LIGHTENINGSTRIKE);
        assertEquals(Spell.LIGHTENINGSTRIKE, warlock.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, warlock.getHp());
    }

    @Test
    public void canReduceHP() {
        warlock.reduceHP(10);
        assertEquals(90, warlock.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        warlock.reduceHP(150);
        assertEquals(0, warlock.getHp());
    }

    @Test
    public void canIncreaseHP() {
        warlock.reduceHP(20);
        warlock.increaseHP(10);
        assertEquals(90, warlock.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        warlock.reduceHP(20);
        warlock.increaseHP(30);
        assertEquals(100, warlock.getHp());
    }

    @Test
    public void canGetCreature() {
        assertEquals(ogre, warlock.getCreature());
    }

    @Test
    public void canChangeCreature() {
        warlock.changeCreature(dragon);
        assertEquals(dragon, warlock.getCreature());
    }


    @Test
    public void canGetCreatureHP__startsFull() {
        assertEquals(100, warlock.getCreatureHP());
    }

    @Test
    public void canReduceCreatureHP() {
        warlock.reduceCreatureHP(10);
        assertEquals(90, warlock.getCreatureHP());
    }
    @Test
    public void canReduceCreatureHP__onlyTo0() {
        warlock.reduceCreatureHP(150);
        assertEquals(0, warlock.getCreatureHP());
    }

    @Test
    public void canIncreaseCreatureHP() {
        warlock.reduceCreatureHP(50);
        warlock.increaseCreatureHP(10);
        assertEquals(60, warlock.getCreatureHP());
    }

    @Test
    public void canIncreaseCreatureHP__onlyTo100() {
        warlock.reduceCreatureHP(50);
        warlock.increaseCreatureHP(80);
        assertEquals(100, warlock.getCreatureHP());
    }
}
