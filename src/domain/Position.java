package domain;

/**
 * Position class
 * represents the position of the Mower
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // advance north if possible y+1
    public void goNorth(int maxYPosition) {
        if (this.y < maxYPosition) {
            this.y = this.y + 1;
        }
    }

    // advance south if possible y-1
    public void goSouth() {
        if (this.y > 0)
            this.y = this.y - 1;
    }

    // advance west if possible x-1
    public void goWest() {
        if (this.x > 0)
            this.x = this.x - 1;
    }

    // advance east if possible x+1
    public void goEast(int maxXPosition) {
        if (this.x < maxXPosition)
            this.x = this.x + 1;
    }
}

