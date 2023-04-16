// Import statement that brings in the entire awt package.
import java.awt.*;

// This is a class to determine how it should act, the colour and the string that represents WhiteTiger.
public class WhiteTiger extends Critter {
    private boolean test;

    // Always Color.WHITE.
    public Color getColor() {
        return Color.WHITE;
    }

    // "tgr" if it hasn’t infected another Critter yet, “TGR” if it has infected.
    public String toString() {

        if (test == true) {
            return "TGR";
        }
        else {
            return "tgr";
        }
    }

    // Always infect if an enemy is in front, otherwise if a wall is in front or to the right, then turn left, otherwise if a fellow Tiger is in front, then turn right, otherwise hop.
    public Action getMove(CritterInfo info) {

        if (info.frontThreat() == true) {
            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        }
        else if (info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        }
        else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        else {
            return Action.HOP;
        }
    }

}


