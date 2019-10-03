package players;

import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void Dwarf() {
        dwarf = new Dwarf (Weapon.AXE, "Flint");
    }

    @Test
    public void hasAName(){
        assertEquals("Flint", dwarf.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.AXE, dwarf.getSelectedItem());
        assertEquals(10, dwarf.getSelectedItem().getValue());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.changeWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, dwarf.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, dwarf.getHp());
    }

    @Test
    public void canReduceHP() {
        dwarf.reduceHP(10);
        assertEquals(90, dwarf.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        dwarf.reduceHP(150);
        assertEquals(0, dwarf.getHp());
    }

    @Test
    public void canIncreaseHP() {
        dwarf.reduceHP(20);
        dwarf.increaseHP(10);
        assertEquals(90, dwarf.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        dwarf.reduceHP(20);
        dwarf.increaseHP(30);
        assertEquals(100, dwarf.getHp());
    }

    @Test
    public void canGetHelmetHP__startsFull() {
        assertEquals(100, dwarf.getHelmetHP());
    }

    @Test
    public void canReduceHelmetHP() {
        dwarf.reduceHelmetHP(10);
        assertEquals(90, dwarf.getHelmetHP());
    }
    @Test
    public void canReduceHelmetHP__onlyTo0() {
        dwarf.reduceHelmetHP(150);
        assertEquals(0, dwarf.getHelmetHP());
    }

    @Test
    public void canIncreaseHelmetHP() {
        dwarf.reduceHelmetHP(50);
        dwarf.increaseHelmetHP(10);
        assertEquals(60, dwarf.getHelmetHP());
    }

    @Test
    public void canIncreaseHelmetHP__onlyTo100() {
        dwarf.reduceHelmetHP(50);
        dwarf.increaseHelmetHP(80);
        assertEquals(100, dwarf.getHelmetHP());
    }


}
