package players;

import creatures.Dragon;
import creatures.Ogre;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Ogre ogre;
    Dragon dragon;

    @Before
    public void Warlock() {
        ogre = new Ogre ();
        dragon = new Dragon();
        wizard = new Wizard(Spell.LIGHTENINGSTRIKE, "Merlin", dragon);
    }

    @Test
    public void hasAName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void canGetSpell() {
        assertEquals(Spell.LIGHTENINGSTRIKE, wizard.getSelectedItem());
        assertEquals(10, wizard.getSelectedItem().getValue());
    }

    @Test
    public void canChangeSpell() {
        wizard.changeSpell(Spell.FIREBALL);
        assertEquals(Spell.FIREBALL, wizard.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, wizard.getHp());
    }

    @Test
    public void canReduceHP() {
        wizard.reduceHP(10);
        assertEquals(90, wizard.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        wizard.reduceHP(150);
        assertEquals(0, wizard.getHp());
    }

    @Test
    public void canIncreaseHP() {
        wizard.reduceHP(20);
        wizard.increaseHP(10);
        assertEquals(90, wizard.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        wizard.reduceHP(20);
        wizard.increaseHP(30);
        assertEquals(100, wizard.getHp());
    }

    @Test
    public void canGetCreature() {
        assertEquals(dragon, wizard.getCreature());
    }

    @Test
    public void canChangeCreature() {
        wizard.changeCreature(ogre);
        assertEquals(ogre, wizard.getCreature());
    }


    @Test
    public void canGetCreatureHP__startsFull() {
        assertEquals(100, wizard.getCreatureHP());
    }

    @Test
    public void canReduceCreatureHP() {
        wizard.reduceCreatureHP(10);
        assertEquals(90, wizard.getCreatureHP());
    }
    @Test
    public void canReduceCreatureHP__onlyTo0() {
        wizard.reduceCreatureHP(150);
        assertEquals(0, wizard.getCreatureHP());
    }

    @Test
    public void canIncreaseCreatureHP() {
        wizard.reduceCreatureHP(50);
        wizard.increaseCreatureHP(10);
        assertEquals(60, wizard.getCreatureHP());
    }

    @Test
    public void canIncreaseCreatureHP__onlyTo100() {
        wizard.reduceCreatureHP(50);
        wizard.increaseCreatureHP(80);
        assertEquals(100, wizard.getCreatureHP());
    }
}
