
public class Pet {
    String name;
    String species;

    public static void petData(Pet subject) {
        System.out.println(subject.name + " the " + subject.species);
    }

    Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }
}