package creatures;

public abstract class Creature {

    private int hp;

    public Creature() {
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
