package DataObjects;

public class Move {

    public enum MoveCategory {
        STATUS,
        PHYSICAL,
        SPECIAL
    }

    public enum Status {
        BURN,
        PARALYZE,
        SLEEP,
        FREEZE,
        POISON,
        TOXIC,
        REST
    }

    public enum Condition {
        CONFUSE,
        FLINCH,
        TRAP,
    }

}
