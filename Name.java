import java.util.Scanner;

public class Name {
    // I figured out how to code my Python gradualPrint() function into Java! 04/30/25 
    static void gradualPrint(String text, int printRate) {
        for (char character : text.toCharArray()) {
            System.out.print(character);
            try {
                Thread.sleep(printRate);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted, exiting...");
                break;
            }
        }
        System.out.println();
    }
    public static void main(String [] args) {
    Scanner theFunny = new Scanner(System.in);
    gradualPrint("Hey, what's your name?", 50);
    System.out.println();
    String userInput = theFunny.nextLine();
    String userName = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
    gradualPrint("Hey, " + userName + ". How's it hangin'?", 50);
    try {
        Thread.sleep(3000);
        gradualPrint("...", 500);
        Thread.sleep(3000);
        gradualPrint("The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues.", 50);
        gradualPrint("The running speed starts slowly but gets faster each minute after you hear this signal.", 50);
        gradualPrint("The 20 meter pacer test will begin in 30 seconds. Line up at the start.", 50);
        gradualPrint("A single lap should be completed every time you hear this sound.", 50);
        gradualPrint("Remember to run in a straight line and run as long as possible.", 50);
        gradualPrint("The second time you fail to complete a lap before the sound, your test is over.", 50);
        gradualPrint("The test will begin on the word \'start\'. On your mark. Get ready!… Start.", 50);
        
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread was interrupted, exiting...");
        return;
    }
}
}