package ch.bnd.pokejava.pokemon;

import ch.bnd.pokejava.pokemon.moves.Type;

public class Move {

    String name;
    int powerPoints;
    int precision;
    Type type;

    public Move(String name, int powerPoints, int precision, Type type) {
        this.name = name;
        this.powerPoints = powerPoints;
        this.precision = precision;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Move : " + name;
    }
}
