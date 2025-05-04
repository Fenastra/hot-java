// A little To-Do class, with a function that I can call in House.java that prints a list of things I need to do for this project.

public class ToDos {
    static String[] toDo = {"Replace the isHungry boolean for the Pet class with a hunger integer, and add a hunger cap of 100. Hunger fills to 100 every time the pet eats", "Add a time tracker and save files like on my Python code, and the according features (Hunger over time, happiness decrease with hunger, etc.) ", "Add a friendship stat", "Add playtime (petting, tricks, toys)"};

    public static void showToDo() {
        for (String toDo1 : toDo) {
            System.out.println("- " + toDo1);
        }
    }
}
