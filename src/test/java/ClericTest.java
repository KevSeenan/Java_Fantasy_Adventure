import enums.Tool;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dwarf dwarf;


    @Before
    public void Cleric() {
        cleric = new Cleric(Tool.HERBS, "Hild");
        dwarf = new Dwarf (Weapon.AXE, "Flint");
    }

    @Test
    public void hasAName(){
        assertEquals("Hild", cleric.getName());
    }

    @Test
    public void canGetTool() {
        assertEquals(Tool.HERBS, cleric.getSelectedItem());
        assertEquals(50, cleric.getSelectedItem().getValue());
    }

    @Test
    public void canChangeTool() {
        cleric.changeTool(Tool.POTION);
        assertEquals(Tool.POTION, cleric.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canReduceHP() {
        cleric.reduceHP(10);
        assertEquals(90, cleric.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        cleric.reduceHP(150);
        assertEquals(0, cleric.getHp());
    }

    @Test
    public void canIncreaseHP() {
        cleric.reduceHP(20);
        cleric.increaseHP(10);
        assertEquals(90, cleric.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        cleric.reduceHP(20);
        cleric.increaseHP(30);
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canHealPlayer(){
        dwarf.reduceHP(80);
        cleric.heal(dwarf);
        assertEquals(70, dwarf.getHp());
    }

}
