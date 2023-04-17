// This defines a simple class of critters that sit around waiting to be taken over by other critters.

// Import statement that brings in the entire awt package.
import java.awt.*;
public class Food extends Critter {
    public Action getMove(CritterInfo info) {
        return Action.INFECT;
    }

    public Color getColor() {
        return Color.GREEN;
    }

    public String toString() {
        return "F";
    }
}
