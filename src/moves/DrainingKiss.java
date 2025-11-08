package src.moves;

import ru.ifmo.se.pokemon.*;

public final class DrainingKiss extends SpecialMove {
    public DrainingKiss() {
        super(Type.FAIRY, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        System.out.println("Атакующий восстанавливает часть HP после удара");
    }

    @Override
    protected String describe() {
        return "использует Draining Kiss";
    }
}