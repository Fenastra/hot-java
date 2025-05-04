package RPGGame;

public class Entity {

    String name;
    String element;

    public static void data(Entity subject) {
        System.out.println(subject.name);
        System.out.println("Controls Element: " + subject.element);
        System.out.println();
    }


    Entity(String name, String element) {
        this.name = name;
        this.element = element;
    }
}
