import java.util.Scanner;

public class Name {
    // I figured out how to code my Python gradualPrint() function into Java! 04/30/25 
    static void gradualPrint(String text, int printRate, boolean shouldNewLine) {
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
        if (shouldNewLine) {
            System.out.println();
        } else {
            return;
        }
    }
    public static void main(String [] args) {
    Scanner theFunny = new Scanner(System.in);
    gradualPrint("Hey, what's your name?", 50, true);
    String userInput = theFunny.nextLine();
    String userName = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
    gradualPrint("Hey, " + userName + ". How's it hangin'?", 50, true);
    try {
        Thread.sleep(3000);
        gradualPrint("...", 500, true);
        Thread.sleep(3000);
        gradualPrint("The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues.", 50, true);
        gradualPrint("The running speed starts slowly but gets faster each minute after you hear this signal.", 50, true);
        gradualPrint("The 20 meter pacer test will begin in 30 seconds. Line up at the start.", 50, true);
        gradualPrint("A single lap should be completed every time you hear this sound.", 50, true);
        gradualPrint("Remember to run in a straight line and run as long as possible.", 50, true);
        gradualPrint("The second time you fail to complete a lap before the sound, your test is over.", 50, true);
        gradualPrint("The test will begin on the word \'start\'.", 50, true);
        Thread.sleep(500);
        gradualPrint("On your mark. ", 50, false);
        Thread.sleep(1000);
        gradualPrint("Get ready!... ", 150, false);
        Thread.sleep(1500);
        gradualPrint("Start.", 30, true);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread was interrupted, exiting...");
        return;
    }
}
}