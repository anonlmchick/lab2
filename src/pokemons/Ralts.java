package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.*;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(28, 25, 25, 45, 35, 40);
        
        addMove(new Thunderbolt());
        addMove(new Swagger());
    }
}
