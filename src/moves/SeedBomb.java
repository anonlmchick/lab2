package src.moves;
import ru.ifmo.se.pokemon.*;

public final class SeedBomb extends PhysicalMove {
    public SeedBomb () {
        super(Type.GRASS, 80, 100);
    }

    @Override
    protected String describe() {
        return "использует Seed Bomb";
    }
}
