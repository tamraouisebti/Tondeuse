package domain;
/**
 * Direction Class
 * represents the different direction possible
 * Left :G
 * Right:D
 * Advance:A
 */
public enum Direction {
    D("DROITE"), G("GAUCHE"), A("AVANCE");

    private final String label;

    Direction(String label) {
        this.label = label;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
}
