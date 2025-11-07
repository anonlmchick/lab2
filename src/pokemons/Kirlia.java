package src.pokemons;

import src.moves.*;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        setStats(38, 35, 35, 65, 55, 50);
        
        addMove(new Thunderbolt());
        addMove(new Swagger());
        addMove(new DrainingKiss());
    }
}
