package animals;

public class Ecosystem {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        hawk.hunt();
        rabbit.flee();

        fish.flee();
        fish.hunt();
    }
}
