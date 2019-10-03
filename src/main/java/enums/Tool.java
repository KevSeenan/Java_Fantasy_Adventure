package enums;

import behaviours.ISelect;

public enum Tool implements ISelect {

    POTION (50),
    HERBS (50);

    private final int value;

    Tool(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
