// Import statement that brings in the entire awt package.
import java.awt.*;
public class Bear extends Critter {
    private Direction test;
    private String bearchar="\\";

    // This is a class to determine how it should act, the colour and the string that represents Bear.
    public Bear(boolean direction) { }

    // Color.WHITE for a polar bear (when polar is true), Color.BLACK otherwise (when polar is false).
    public Color getColor() {
        if (test == Direction.NORTH) {
            return Color.WHITE;
        }
        else if (test == Direction.SOUTH) {
            return Color.WHITE;
        }
        else {
            return Color.BLACK;
        }
    }

    //Should alternate on each different move between a slash character (/) and a backslash character () starting with a slash.
    public String toString() {
        if (bearchar == "/") {
            bearchar = "\\";
        } else if (bearchar == "\\"){
            bearchar = "/";
        }

        return bearchar;

    }
    // Always infect if an enemy is in front, otherwise hop if possible, otherwise turn left.
    public Action getMove(CritterInfo info) {

        test = info.getDirection();

        if (info.frontThreat() == true) {
            return Critter.Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY) {
            return Critter.Action.HOP;
        }

        else {
            return Action.LEFT;
        }
    }

}

