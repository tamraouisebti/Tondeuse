package domain;

public enum Orientation {
    N("NORTH"), E("EAST"), W("WEST"), S("SOUTH");

    private final String label;

    private Orientation(String label) {
        this.label = label;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
}
