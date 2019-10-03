package players;

import behaviours.ISelect;

public abstract class Player implements  ISelect {

    private int hp;
    private ISelect selectedItem;

    public Player(ISelect startingItem){
        this.hp = 100;
        this.selectedItem = startingItem;
    }


}
