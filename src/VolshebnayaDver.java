public class VolshebnayaDver {
    public static Hero[] hero = new Hero[4];


    public Hero[] returnHero() {
        hero[0] = new Hero(200, 20, "Physical");
        hero[1] = new Hero(250, 20, "Warrior");
        hero[2] = new Hero(150, 20, "Magic");
        hero[3] = new Hero(150, 20, "Mental");

        return hero;


    }

}
