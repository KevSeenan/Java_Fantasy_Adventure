package players;

import behaviours.IChooseWeapon;
import behaviours.ISelect;
import enums.Weapon;

public class Barbarian extends Player implements IChooseWeapon {
    private String name;
    private int shieldHP;

    public Barbarian(ISelect startingItem, String name) {
        super(startingItem);
        this.name = name;
        this.shieldHP = 100;
    }

    public String getName() {
        return name;
    }

    public void changeWeapon(Weapon weapon) {
        this.setSelectedItem(weapon);
    }

    public int getShieldHP() {
        return shieldHP;
    }

    public void reduceShieldHP(int damageValue) {
        if (damageValue >= this.shieldHP){
            this.shieldHP = 0;
        } else {
            this.shieldHP -= damageValue;
        }
    }

    public void increaseShieldHP(int healValue) {
        if (this.shieldHP + healValue >= 100){
            this.shieldHP = 100;
        } else {
            this.shieldHP += healValue;
        }
    }
}
