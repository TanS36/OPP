package BattleArena.elements;

public enum Element {
    EARTH, WATER, FIRE, WIND, LIGHT, DARK;

    public boolean beats(Element other) {
        return switch (this) {
            case EARTH -> other == WATER;
            case WATER -> other == FIRE;
            case FIRE -> other == WIND;
            case WIND -> other == EARTH;
            case LIGHT -> other == DARK;
            case DARK -> other == LIGHT;
        };
    }
}
