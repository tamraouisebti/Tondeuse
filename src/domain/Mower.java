package domain;

import java.util.List;

/**
 * Mower Class
 * Reprents a Mower and its parameters
 */
public class Mower {
    /**
     * current mower position.
     */
    private Position position;
    /**
     * current mower orientation.
     */
    private Orientation orientation;
    /**
     * the directions to follow
     */
    private List<Direction> directionList;

    public Mower(Position position, Orientation orientation, List<Direction> directionList) {
        this.position = position;
        this.orientation = orientation;
        this.directionList = directionList;
    }

    // Mow the Lawn by moving according to the directions
    public void mow(int maxXpostion, int maxYposition) {
        for (Direction direction : directionList) {
            switch (direction) {
                case A:
                    advance(maxXpostion, maxYposition);
                    break;
                case D:
                    turnRight();
                    break;
                case G:
                    turnLeft();
                    break;
            }
        }
    }

    // Turning left by 90°
    void turnLeft() {
        switch (orientation) {
            case N:
                orientation = Orientation.W;
                break;
            case W:
                orientation = Orientation.S;
                break;
            case S:
                orientation = Orientation.E;
                break;
            case E:
                orientation = Orientation.N;
                break;
        }
    }

    // Turning right by 90°
    void turnRight() {
        switch (orientation) {
            case N:
                orientation = Orientation.E;
                break;
            case E:
                orientation = Orientation.S;
                break;
            case S:
                orientation = Orientation.W;
                break;
            case W:
                orientation = Orientation.N;
                break;
        }
    }

    // advance if possible
    void advance(int maxXPosition, int maxYPosition) {
        switch (orientation) {
            case N:
                position.goNorth(maxYPosition);
                break;
            case E:
                position.goEast(maxXPosition);
                break;
            case S:
                position.goSouth();
                break;
            case W:
                position.goWest();
                break;
        }

    }


    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

}
