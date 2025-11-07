package src.moves;
import ru.ifmo.se.pokemon.*;

public final class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60, 100);
    }
    
    @Override
    protected String describe() {
        return "использует Feint Attack";
    }
}
