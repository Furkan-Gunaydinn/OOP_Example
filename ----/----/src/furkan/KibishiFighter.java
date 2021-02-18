package furkan;

public class KibishiFighter extends Fighter implements JudoAttackBehaviours {


    public KibishiFighter(String name, int health) {
        super(name, health);
    }

    @Override
    Fighter attackTo(Fighter opponent) {

        return judoAttackTo(opponent);


    }

    @Override
    public Fighter judoAttackTo(Fighter opponent) {
        opponent.health = opponent.health - 15;
        return opponent;
    }
}
