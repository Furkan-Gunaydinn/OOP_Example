package furkan;

public abstract class Fighter {
    private String name;
    protected int health;
    private boolean isDead =false ;

    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;

    }

    abstract Fighter attackTo(Fighter opponent);


    void defense() {
        this.health = this.health + 10;
    }

    public boolean isDead() {

        if ( this.health < 0) {
           this.isDead=true;

            return true;

        } else {
            return false;
        }
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

}
