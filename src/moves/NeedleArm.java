package src.moves;
import ru.ifmo.se.pokemon.*;

public final class NeedleArm extends PhysicalMove {
    public NeedleArm() {
        super(Type.GRASS, 60, 100);
    }

    @Override
    protected String describe() {
        return "использует Needle Arm";
    }
}
