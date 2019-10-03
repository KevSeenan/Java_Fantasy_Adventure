package enums;

import behaviours.ISelect;

public enum Weapon implements ISelect {

    AXE (10),
    CLUB (10),
    SWORD (10);

    private final int value;

    Weapon(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
