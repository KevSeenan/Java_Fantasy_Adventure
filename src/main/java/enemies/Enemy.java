package enemies;

import behaviours.ITask;

public abstract class Enemy implements ITask {

    private int hp;

    public Enemy() {
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void reduceHP(int damageValue){
        if (damageValue >= this.hp){
            this.hp = 0;
        } else {
            this.hp -= damageValue;
        }
    }

    public boolean isComplete(){
        return this.hp == 0;
    }
}
