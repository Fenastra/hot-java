public class House {
    public static void main(String [] args) {
        
        Pet tony = new Pet("Tony", "Horse");
        Pet fido = new Pet("Fido", "Dog");

        Pet.petData(tony);
        Pet.petData(fido);
    }
}