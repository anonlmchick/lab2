package src.pokemons;
import ru.ifmo.se.pokemon.*;
import src.moves.*;

public final class Maractus extends Pokemon {
    public Maractus(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(75, 86, 67, 106, 67, 60);

        addMove(new SeedBomb());
        addMove(new Peck());
        addMove(new PetalBlizzard());
        addMove(new NeedleArm());
    }
}
