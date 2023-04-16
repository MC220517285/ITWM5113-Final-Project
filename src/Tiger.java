// Import statement that brings in the entire awt package.
import java.awt.*;

// Import statement that brings in the Random class from the java.util package.
import java.util.Random;

// This is a class to determine how it should act, the colour and the string that represents Tiger.
public class Tiger extends Critter{
    Color r;
    Color g;
    Color b;

    public Color randcolor;
    private static int count = 0;
    private static int count2 = 0;

    public Color getColor() {

        return randomColor();
    }

    // Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) and uses that color for three moves.
    public Color randomColor()
    {
        int r = (int) (Math.random()*3);

        if (r==0) {
            randcolor = new Color(255,   0,   0);//red
        }

        if (r==1) {
            randcolor = new Color(0,   255,   0);//green
        }

        else if (r==2) {
            randcolor = new Color(0,   0,   255);//blue
        }

        return randcolor;
    }

    // toString as "TGR"
    public String toString() {
        return "TGR";
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


