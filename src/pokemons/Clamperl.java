package src.pokemons;
import ru.ifmo.se.pokemon.*;
import src.moves.*;

public class Clamperl extends Pokemon {
    public Clamperl(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(35, 64, 85, 74, 55, 32);

        addMove(new Scald());
        addMove(new Blizzard());
        addMove(new Confide());
    }
}
