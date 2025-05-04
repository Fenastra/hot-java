// This is the majority of the code. Lays out pet behaviors and attributes.

public class Pet {

    String name;
    String species;
    int happiness;
    int sweet;
    int sour;
    int salty;
    int bitter;
    int umami;
    boolean isFull;
    // Prints a pet's data.

    public static void data(Pet subject) {
        System.out.println(("-" + subject.name + " the " + subject.species + "-").toUpperCase());
        System.out.println();
        System.out.println("Happiness: " + subject.happiness);
        System.out.println();
        System.out.println("Sweet: " + subject.sweet);
        System.out.println("Sour: " + subject.sour);
        System.out.println("Salty: " + subject.salty);
        System.out.println("Bitter: " + subject.bitter);
        System.out.println("Umami: " + subject.umami);
        System.out.println();
        if (!subject.isFull) {
            System.out.println(subject.name + " is hungry!");
        } else {
            System.out.println(subject.name + " is full.");
        }
        System.out.println();
    }

    public static void reaction(Pet subject, int happinessAdd) {
        if (happinessAdd >= 2) {
            System.out.println(subject.name + " loves it!!");
        } else if (happinessAdd >= 0 && happinessAdd < 2) {
            System.out.println(subject.name + " likes it!");
        } else if (happinessAdd < 0 && happinessAdd > -3) {
            System.out.println(subject.name + " doesn't like it.");
        } else if (happinessAdd <= -3) {
            System.out.println(subject.name + " hates it...");
        }

        if (happinessAdd != 0) {
            subject.happiness += happinessAdd;
        } else {
            subject.happiness += (happinessAdd + 1);
        }

        if (subject.happiness >= 5) {
            subject.happiness = 5;
        }
        System.out.println();
        Pet.data(subject);
    }

    // Feeds a pet a given Food

    public static void feed(Pet subject, Food food) {
        System.out.print("You give " + subject.name + " a " + food.name + ". ");
        if (!subject.isFull) {
            int totalHappy = 0;
            switch(food.flavor) {
                case "Sweet" -> totalHappy = (food.baseHappy + subject.sweet) - 3;
                case "Sour" -> totalHappy = (food.baseHappy + subject.sour) - 3;
                case "Salty" -> totalHappy = (food.baseHappy + subject.salty) - 3;
                case "Bitter" -> totalHappy = (food.baseHappy + subject.bitter) - 3;
                case "Umami" -> totalHappy = (food.baseHappy + subject.umami) - 3;
            }
            subject.isFull = true;
            reaction(subject, totalHappy);
            food.quantity--;
        } else {
            System.out.println(subject.name + " is full!");
        }
    }

    Pet(String name, String species, int happiness, int sweet, int sour, int salty, int bitter, int umami, boolean isFull) {
        this.name = name;
        this.species = species;
        this.happiness = happiness;
        this.sweet = sweet;
        this.sour = sour;
        this.salty = salty;
        this.bitter = bitter;
        this.umami = umami;
        this.isFull = isFull;
    }
}