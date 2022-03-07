package ch.bnd.pokejava.pokemon.moves;

import ch.bnd.pokejava.pokemon.Move;

public class Damage extends Move {

    int power;

    public Damage(String name, int powerPoints, int precision, int power, Type type) {
        super(name, powerPoints, precision, type);
        this.power = power;
    }
}
