package behaviours;

import creatures.Creature;
import enums.Spell;

public interface IChooseMagic {

    void changeSpell(Spell spell);
    void changeCreature(Creature creature);
}
