public class Main {

    public static void main(String[] args) {
        Hero play = new Hero();

        play.Naruto = "Naruto";
        play.health = 500;
        play.damage = 100;
        play.superpower = "invisible";
        System.out.println("Hero" + play.Naruto);
        System.out.println("health" + play.health);
        System.out.println("damage" + play.damage);
        System.out.println("superpower" + play.superpower);

        Boss play2 = new Boss();
        play2.Boss = "Boss";
        play2.health = 1000;
        play2.damage = 150;
        play2.protection = "shield";


        System.out.println("Boss");
        System.out.println("health" + play2.health);
        System.out.println("damage" + play2.damage);
        System.out.println("protection" + play2.protection);



    }
}


