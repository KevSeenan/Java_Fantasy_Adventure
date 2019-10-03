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

    public void reduceHP(int damageValue){
        if (damageValue >= this.hp){
            this.hp = 0;
        } else {
            this.hp -= damageValue;
        }
    }

    public void increaseHP(int healValue){
        if (this.hp + healValue >= 100){
            this.hp = 100;
        } else {
            this.hp += healValue;
        }
    }
}
