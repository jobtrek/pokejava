package ch.bnd.pokejava.pokemon.moves;

import ch.bnd.pokejava.pokemon.Move;

public class Status extends Move {

    int statsModifier;

    public Status(String name, int powerPoints, int precision, int statsModifier, Type type) {
        super(name, powerPoints, precision, type);
        this.statsModifier = statsModifier;
    }
}
