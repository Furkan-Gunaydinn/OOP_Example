package furkan;

public class OOPfinal02 {
    public static void main(String[] args) {

        Fighter kibishifighter = new KibishiFighter("kibishi", 100);

        Fighter hybritfighter = new HybritFighter("hibrit", 90);


        while (!kibishifighter.isDead() && !hybritfighter.isDead()) {

            kibishifighter.attackTo(hybritfighter);
          //  kibishifighter.defense();
        hybritfighter.defense();
        }

        
        System.out.println(kibishifighter.health );
        System.out.println(hybritfighter.health);
    }

    
}
