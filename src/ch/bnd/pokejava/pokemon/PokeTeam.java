package ch.bnd.pokejava.pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokeTeam {

    private ArrayList<Pokemon> pokemons;

    public PokeTeam(Pokemon... pokemons) {
        this.pokemons = new ArrayList<Pokemon>(List.of(pokemons));
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
