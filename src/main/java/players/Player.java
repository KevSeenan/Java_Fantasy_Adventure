package players;

import behaviours.ISelect;

public abstract class Player {

    private int hp;
    private ISelect selectedItem;

    public Player(ISelect startingItem){
        this.hp = 100;
        this.selectedItem = startingItem;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public ISelect getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(ISelect selectedItem) {
        this.selectedItem = selectedItem;
    }
}
