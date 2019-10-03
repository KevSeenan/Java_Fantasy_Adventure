package enums;

import behaviours.ISelect;

public enum Spell implements ISelect {

    LIGHTENINGSTRIKE (10),
    FIREBALL (10);

    private final int value;

    Spell(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
