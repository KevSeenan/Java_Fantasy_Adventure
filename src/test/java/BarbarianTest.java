import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void Barbarian() {
        barbarian = new Barbarian (Weapon.CLUB, "Barbara");
    }

    @Test
    public void hasAName(){
        assertEquals("Barbara", barbarian.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.CLUB, barbarian.getSelectedItem());
        assertEquals(10, barbarian.getSelectedItem().getValue());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getSelectedItem());
    }

    @Test
    public void hasHP__startsFull() {
        assertEquals(100, barbarian.getHp());
    }

    @Test
    public void canReduceHP() {
        barbarian.reduceHP(10);
        assertEquals(90, barbarian.getHp());
    }

    @Test
    public void canReduceHP__onlyToZero() {
        barbarian.reduceHP(150);
        assertEquals(0, barbarian.getHp());
    }

    @Test
    public void canIncreaseHP() {
        barbarian.reduceHP(20);
        barbarian.increaseHP(10);
        assertEquals(90, barbarian.getHp());
    }

    @Test
    public void canIncreaseHP__onlyTo100() {
        barbarian.reduceHP(20);
        barbarian.increaseHP(30);
        assertEquals(100, barbarian.getHp());
    }

    @Test
    public void canGetShieldHP__startsFull() {
        assertEquals(100, barbarian.getShieldHP());
    }

    @Test
    public void canReduceShieldHP() {
        barbarian.reduceShieldHP(10);
        assertEquals(90, barbarian.getShieldHP());
    }
    @Test
    public void canReduceShieldHP__onlyTo0() {
        barbarian.reduceShieldHP(150);
        assertEquals(0, barbarian.getShieldHP());
    }

    @Test
    public void canIncreaseShieldHP() {
        barbarian.reduceShieldHP(50);
        barbarian.increaseShieldHP(10);
        assertEquals(60, barbarian.getShieldHP());
    }

    @Test
    public void canIncreaseShieldHP__onlyTo100() {
        barbarian.reduceShieldHP(50);
        barbarian.increaseShieldHP(80);
        assertEquals(100, barbarian.getShieldHP());
    }
}
