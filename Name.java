import java.util.Scanner;

public class Name {
    // I figured out how to code my Python gradualPrint() function into Java! 04/30/25 
    static void gradualPrint(String text) {
        for (char character : text.toCharArray()) {
            System.out.print(character);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted, exiting...");
                break;
            }
        }
    }
    public static void main(String [] args) {
    Scanner theFunny = new Scanner(System.in);
    gradualPrint("Hey, what's your name?");
    System.out.println();
    String userInput = theFunny.nextLine();
    String userName = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
    gradualPrint("Hey, " + userName + ". How's it hangin'?");
        }
    }