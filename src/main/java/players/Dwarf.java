package players;

import behaviours.IChooseWeapon;
import behaviours.ISelect;
import enums.Weapon;


public class Dwarf extends Player implements IChooseWeapon {

    private String name;
    private int helmetHP;

    public Dwarf(ISelect startingItem, String name) {
        super(startingItem);
        this.name = name;
        this.helmetHP = 100;
    }

    public String getName() {
        return name;
    }

    public void changeWeapon(Weapon weapon) {
        this.setSelectedItem(weapon);
    }

    public int getHelmetHP() {
        return helmetHP;
    }

    public void reduceHelmetHP(int damageValue) {
        if (damageValue >= this.helmetHP){
            this.helmetHP = 0;
        } else {
            this.helmetHP -= damageValue;
        }
    }

    public void increaseHelmetHP(int healValue) {
        if (this.helmetHP + healValue >= 100){
            this.helmetHP = 100;
        } else {
            this.helmetHP += healValue;
        }
    }
}
