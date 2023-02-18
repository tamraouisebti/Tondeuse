package domain;

/**
 * Orientation Class
 * represents the four orientations
 * N : North
 * E : East
 * W : West
 * S : South
 */
public enum Orientation {
    N("NORTH"), E("EAST"), W("WEST"), S("SOUTH");

    private final String label;

    Orientation(String label) {
        this.label = label;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
}
