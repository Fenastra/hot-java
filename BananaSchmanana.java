import java.util.*;

public class BananaSchmanana {
    public static void main(String[] args) {
      Scanner banana = new Scanner (System.in);
      System.out.println("Monke: i havz banan 4 u");
      System.out.println();
      String bananaOut = banana.nextLine();
      String bananaOut2 = bananaOut.substring(1).toLowerCase();
      String peelOut = "schm" + bananaOut2;
      System.out.println(peelOut);
    }
}