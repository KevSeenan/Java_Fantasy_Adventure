package players;

import behaviours.IChooseMagic;
import behaviours.ISelect;
import creatures.Creature;
import enums.Spell;

public class Warlock extends Player implements IChooseMagic {

    private String name;
    private Creature creature;

    public Warlock(ISelect startingItem, String name, Creature creature) {
        super(startingItem);
        this.name = name;
        this.creature = creature;
    }

    public String getName() {
        return name;
    }

    public void changeSpell(Spell spell) {
        this.setSelectedItem(spell);
    }

    public void changeCreature(Creature creature) {
        this.creature = creature;
    }

    public int getCreatureHP() {
        return this.creature.getHp();
    }

    public void reduceCreatureHP(int damageValue) {
        this.creature.reduceHP(damageValue);
    }

    public void increaseCreatureHP(int healValue) {
        this.creature.increaseHP(healValue);
    }
}
