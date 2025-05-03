public class House {
    public static void main(String [] args) {
        
        Pet tony = new Pet("Tony", "Horse", 0, 0, 3, 5, 2, 4, false);
        Food burger = new Food("Burger", 2, "Umami", 1);


        Pet.data(tony);
        Pet.feed(tony, burger);
        ToDos.showToDo();
    }
}