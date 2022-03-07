package ch.bnd.pokejava;

import ch.bnd.pokejava.pokemon.Move;
import ch.bnd.pokejava.pokemon.PokeTeam;
import ch.bnd.pokejava.pokemon.Pokemon;
import ch.bnd.pokejava.pokemon.moves.Damage;
import ch.bnd.pokejava.pokemon.moves.Status;
import ch.bnd.pokejava.pokemon.moves.Type;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Some moves
        var moves = new ArrayList<Move>();
        moves.add(new Status("rugissement", 40, 100, -1, Type.NORMAL));
        moves.add(new Status("boule'armure", 40, 100, 1, Type.NORMAL));
        moves.add(new Damage("lance flamme", 15, 100, 90, Type.FEU));
        moves.add(new Damage("hydrocanon", 5, 75, 120, Type.EAU));
        moves.add(new Damage("fatal foudre", 5, 75, 120, Type.ELECTRIQUE));
        moves.add(new Damage("psycho", 10, 100, 90, Type.PSY));


        // Creation of my new pokemon team :
        var team = new PokeTeam(
                new Pokemon("Pikachu", moves.get(4), moves.get(0), moves.get(1), null),
                new Pokemon("Mewtwo", moves.get(5), moves.get(4), moves.get(3), moves.get(2))
        );

        // Display the poke team in the console
        team.getPokemons().forEach(p -> System.out.println(p.toString()));

    }
}
