package src.pokemons;
import ru.ifmo.se.pokemon.*;
import src.moves.*;

public class Huntail extends Clamperl {
    public Huntail(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(55, 104, 105, 94, 75, 52);
        addMove(new FeintAttack());
        addMove(new Scald());
        addMove(new Blizzard());
        addMove(new Confide());
    }
}
