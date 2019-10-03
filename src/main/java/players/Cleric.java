package players;

import behaviours.IChooseTool;
import behaviours.ISelect;
import enums.Tool;

public class Cleric extends Player implements IChooseTool {

    private String name;

    public Cleric(ISelect startingItem, String name) {
        super(startingItem);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeTool(Tool tool) {
        this.setSelectedItem(tool);
    }

    public void heal(Player player) {
        player.increaseHP(this.getSelectedItem().getValue());
    }
}
