package src.pokemons;
import ru.ifmo.se.pokemon.*;
import src.moves.*;

public class Gallade extends Kirlia {
    public Gallade(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FIGHTING);
        setStats(68, 125, 65, 65, 115, 80);
        
        addMove(new Thunderbolt());
        addMove(new Swagger());
        addMove(new DrainingKiss());
        addMove(new LeafBlade());
    }
}
