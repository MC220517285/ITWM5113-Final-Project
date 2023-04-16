
import java.awt.*;

//This is a class to determine how it should act, the colour and the string that represents NinjaCat

public class NinjaCat extends Critter{
    public Critter.Action getMove(CritterInfo info) {

        if (info.getFront() == Neighbor.OTHER || info.getRight() == Neighbor.OTHER || info.getBack() == Neighbor.OTHER || info.getLeft() == Neighbor.OTHER)
        {
            return Action.INFECT;
        }
        else if (info.frontThreat() == true || info.backThreat() == true || info.leftThreat() == true || info.rightThreat() == true) {
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

        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }

        else {
            return Action.HOP;
        }
    }

    //Color.Magenta
    public Color getColor() {
        return Color.MAGENTA;
    }

    public String toString() {
        return "^C^";
    }
}


