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
//не работает, т. к. в библиотеке нет счетчика снесенного здоровья. можно сделать фикс восстановление хп
// package src.moves;

// import ru.ifmo.se.pokemon.*;

// public final class DrainingKiss extends SpecialMove {
//     public DrainingKiss() {
//         super(Type.FAIRY, 50, 100);
//     }

//     @Override
//     protected void applySelfEffects(Pokemon p) {
//         // Восстанавливаем фиксированное количество HP атакующего
//         p.setMod(Stat.HP, 10); 
//         System.out.println("Атакующий восстанавливает 10 HP после удара");
//     }

//     @Override
//     protected String describe() {
//         return "использует Draining Kiss";
//     }
// }
