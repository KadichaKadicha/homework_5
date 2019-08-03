public class Boss {
    private int health;
     private int hits;
    private int defence;
     public Boss(int health, int hits, int defence){
         this.setHealth(health);
         this.setHits(hits);
         this.setDefence(defence);
         getHealth();
         getHits();
         getDefence();
         changeBossDefence();
     }
    public static void changeBossDefence()  {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits)
    {
        this.hits = hits;
    }

    public int getDefence()
    {
        return defence;
    }

    public void setDefence(int defence)
    {

    }

}
