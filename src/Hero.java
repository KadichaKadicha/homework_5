public class Hero {
    int health;
    int hits;
    String hitTypes;
    String[] hero=new String[4];


    public Hero(int health, int hits, String hitTypes){
        this.health=health;
        this.hits=hits;
        this.hitTypes=hitTypes;


    }
    public String toString () {
        return " health: " + health + " damage: " + hits+ " superpower: " + hitTypes+ "\n";

    }
}
