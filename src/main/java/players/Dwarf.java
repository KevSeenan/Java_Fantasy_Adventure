package players;

import behaviours.IChooseWeapon;
import behaviours.ISelect;
import enums.Weapon;


public class Dwarf extends Player implements IChooseWeapon {

    private String name;

    public Dwarf(ISelect startingItem, String name) {
        super(startingItem);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeWeapon(Weapon weapon) {
        //TODO: gee this guy a weapon and change it
    }
}
