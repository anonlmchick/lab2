package src;

import ru.ifmo.se.pokemon.*;
import src.pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();


        Pokemon maractus = new Maractus("Maractus", 50);
        Pokemon ralts = new Ralts("Ralts", 50);
        Pokemon kirlia = new Kirlia("Kirlia", 50);


        Pokemon clamperl = new Clamperl("Clamperl", 50);
        Pokemon huntail = new Huntail("Huntail", 50);
        Pokemon gallade = new Gallade("Gallade", 50);


        b.addAlly(maractus);
        b.addAlly(ralts);
        b.addAlly(kirlia);

        b.addFoe(clamperl);
        b.addFoe(huntail);
        b.addFoe(gallade);

        b.go();
    }
}