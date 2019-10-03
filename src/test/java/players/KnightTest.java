package players;

import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void Knight() {
        knight = new Knight (Weapon.SWORD, "Sturm");
    }

    @Test
    public void hasAName(){
        assertEquals("Sturm", knight.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.SWORD, knight.getSelectedItem());
        assertEquals(10, knight.getSelectedItem().getValue());
    }

    @Test
    public void canChangeWeapon() {
    knight.changeWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, knight.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, knight.getHp());
    }

    @Test
    public void canReduceHP() {
        knight.reduceHP(10);
        assertEquals(90, knight.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        knight.reduceHP(150);
        assertEquals(0, knight.getHp());
    }

    @Test
    public void canIncreaseHP() {
        knight.reduceHP(20);
        knight.increaseHP(10);
        assertEquals(90, knight.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        knight.reduceHP(20);
        knight.increaseHP(30);
        assertEquals(100, knight.getHp());
    }

    @Test
    public void canGetArmourHP__startsFull() {
        assertEquals(100, knight.getArmourHP());
    }

    @Test
    public void canReduceArmourHP() {
        knight.reduceArmourHP(10);
        assertEquals(90, knight.getArmourHP());
    }
    @Test
    public void canReduceArmourHP__onlyTo0() {
        knight.reduceArmourHP(150);
        assertEquals(0, knight.getArmourHP());
    }

    @Test
    public void canIncreaseArmourHP() {
        knight.reduceArmourHP(50);
        knight.increaseArmourHP(10);
        assertEquals(60, knight.getArmourHP());
    }

    @Test
    public void canIncreaseArmourHP__onlyTo100() {
        knight.reduceArmourHP(50);
        knight.increaseArmourHP(80);
        assertEquals(100, knight.getArmourHP());
    }
}
