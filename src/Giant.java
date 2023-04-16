// Import statement that brings in the entire awt package.
import java.awt.*;

// This is a class to determine how should it act, the color and the string that represents Giant.
public class Giant<Private> extends Critter{
    private static int count = 0;
    private static int count2 = 0;

    //Color.GRAY
    public Color getColor() {
        return Color.GRAY;
    }

    // "fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves, then "fum" for 6 moves, then repeat.
    public String toString() {

        count++;
        count2 = count/30;

        if (count2==24)
        {
            count = 0;
        }

        if (count2<=6)
        {
            return "fee";
        }

        if (count2<=12)
        {
            return "fie";
        }

        if (count2<=18)
        {
            return "foe";
        }

        else
        {
            return  "fum";
        }

    }

    // Always infect if an enemy is in front, otherwise hop if possible, otherwise turn right.
    public Critter.Action getMove(CritterInfo info) {
        if (info.frontThreat() == true) {
            return Critter.Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY) {
            return Critter.Action.HOP;
        }

        else {
            return Action.RIGHT;
        }
    }

}


