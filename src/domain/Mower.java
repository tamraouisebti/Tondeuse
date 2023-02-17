package domain;

import java.util.List;

/**
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

    public List<Direction> getDirectionList() {
        return directionList;
    }
}
