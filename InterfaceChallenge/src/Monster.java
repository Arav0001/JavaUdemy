import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {

        return this.name;
    }

    public int getHitPoints() {

        return this.hitPoints;
    }

    public int getStrength() {

        return this.strength;
    }

    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();

        values.add(0, this.name);
        values.add(1, Integer.toString(this.hitPoints));
        values.add(2, Integer.toString(this.strength));

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues != null && savedValues.size() > 0) {

            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {

        return "Player{name='" +
                this.name + "'" +
                ", hitPoints=" +
                this.hitPoints +
                ", strength=" +
                this.strength + "}";
    }
}