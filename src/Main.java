import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        Hero num1=new Hero(200, 20, "Physical");
        Hero num2=new Hero(200, 20, "Warrior");
        Hero num3=new Hero(200, 20, "Magic");
        Hero num4=new Hero(200, 20, "Mental");
        Boss b=new Boss(600,60, 100);


        VolshebnayaDver p =new VolshebnayaDver( );
        int bhealth= b.getHealth();
        int bhits=b.getHits();
        int bhitTypes=b.getDefence();
        Hero [] abc=new  Hero[4];
        String[] hero=new String[4];
        hero[0]="Physical";
        hero[1]="Warrior";
        hero[2]="Magic";
        hero[3]="Mental";

        System.out.println(hero[3]);
        System.out.println(Arrays.toString(VolshebnayaDver.returnHero()));;



    }
}
