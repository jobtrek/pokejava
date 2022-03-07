package ch.bnd.pokejava.pokemon;

public class Pokemon {

    String name;

    Move attack1;
    Move attack2;
    Move attack3;
    Move attack4;

    public Pokemon(String name, Move attack1, Move attack2, Move attack3, Move attack4) {
        this.name = name;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", attack1=" + attack1 +
                ", attack2=" + attack2 +
                ", attack3=" + attack3 +
                ", attack4=" + attack4 +
                '}';
    }
}
