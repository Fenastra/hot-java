package RPGGame;

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World");
        System.out.println();
        Entity redSlime = new Entity("Red Slime", "Fire");
        Entity blueSlime = new Entity("Blue Slime", "Water");
        Entity.data(redSlime);
        Entity.data(blueSlime);
    }
}