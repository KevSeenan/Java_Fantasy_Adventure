package treasure;

public abstract class Treasure {

    private int value;

    public Treasure(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
