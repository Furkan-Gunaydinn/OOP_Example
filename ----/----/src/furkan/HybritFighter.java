package furkan;

public class HybritFighter extends Fighter implements MuayThaiAttackBehaviour, BoxingAttackBehaviours {

    public HybritFighter(String name, int health) {
        super(name, health);
    }

    @Override
    Fighter attackTo(Fighter opponent) {
        muayThaiAttackTo(opponent);
        return boxingAttackTo(opponent);

    }

    @Override
    public Fighter boxingAttackTo(Fighter opponent) {
        opponent.health = opponent.health - 20;
        return opponent;
    }

    @Override
    public Fighter muayThaiAttackTo(Fighter opponent) {
        opponent.health =  opponent.health - 6;
        return opponent;
    }
}
