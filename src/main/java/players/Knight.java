package players;

import behaviours.IChooseWeapon;
import behaviours.ISelect;
import enums.Weapon;

public class Knight extends Player implements IChooseWeapon {

    private String name;
    private int armourHP;

    public Knight(ISelect startingItem, String name) {
        super(startingItem);
        this.name = name;
        this.armourHP = 100;
    }

    public String getName() {
        return name;
    }

    public void changeWeapon(Weapon weapon) {
        this.setSelectedItem(weapon);
    }

    public int getArmourHP() {
        return armourHP;
    }

    public void reduceArmourHP(int damageValue) {
        if (damageValue >= this.armourHP){
            this.armourHP = 0;
        } else {
            this.armourHP -= damageValue;
        }
    }

    public void increaseArmourHP(int healValue) {
        if (this.armourHP + healValue >= 100){
            this.armourHP = 100;
        } else {
            this.armourHP += healValue;
        }
    }
}
