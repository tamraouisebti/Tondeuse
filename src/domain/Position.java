package domain;

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

    public void goNorth(int maxYPosition) {
        if (this.y < maxYPosition) {
            this.y = this.y + 1;
        }
    }

    public void goSouth() {
        if (this.y > 0)
            this.y = this.y - 1;
    }

    public void goWest() {
        if (this.x > 0)
            this.x = this.x - 1;
    }

    public void goEast(int maxXPosition) {
        if (this.x < maxXPosition)
            this.x = this.x + 1;
    }
}

