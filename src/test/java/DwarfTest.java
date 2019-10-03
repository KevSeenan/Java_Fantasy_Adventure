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


}
