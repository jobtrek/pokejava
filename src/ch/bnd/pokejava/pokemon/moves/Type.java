package ch.bnd.pokejava.pokemon.moves;

public enum Type {

    NORMAL (0),
    EAU (64),
    FEU (128),
    PSY (192),
    SOL (256),
    VOL (320),
    TENEBRES (8),
    ELECTRIQUE (16),
    ;

    private final int attackId;

    Type(int attackId) {
        this.attackId = attackId;
    }

    public int getAttackId() {
        return attackId;
    }
}
