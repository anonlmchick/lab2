package src.moves;
import ru.ifmo.se.pokemon.*;

public final class PetalBlizzard extends PhysicalMove {
    public PetalBlizzard () {
        super(Type.GRASS, 90, 100);
    }
    
    @Override
    protected String describe() {
        return "испрользует PetalBlizzard";
    }
}