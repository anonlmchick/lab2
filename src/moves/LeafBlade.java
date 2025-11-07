package src.moves;
import ru.ifmo.se.pokemon.*;

public final class LeafBlade extends PhysicalMove {
    public LeafBlade() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 2;
    }

    @Override
    protected String describe() {
        return "использует Leaf Blade";
    }
}
