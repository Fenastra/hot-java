// This is where the Food class is defined, along with its data print function.

public class Food {
    String name;
    int baseHappy;
    String flavor;
    int quantity;

    public static void data(Food subject) {
        System.out.println(subject.name);
        System.out.println("Flavor: " + subject.flavor);
        System.out.println("Quality: " + subject.baseHappy + "/5");
        System.out.println();
        System.out.println("You own " + subject.quantity + " of these");
        System.out.println();
    }

    Food(String name, int baseHappy, String flavor, int quantity) {
    this.name = name;
    this.baseHappy = baseHappy;
    this.flavor = flavor;
    this.quantity = quantity;
    }
}