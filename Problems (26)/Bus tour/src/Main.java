import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int busHeight = scanner.nextInt();
       int numberOfBridges = scanner.nextInt();
       boolean crash = false;
       int bridgeHit = 1;

       for (int i = 1; i <= numberOfBridges; i++) {
           int bridgeHeight = scanner.nextInt();
           if (busHeight >= bridgeHeight) {
               crash = true;
               bridgeHit = i;
               break;
           }
       }
       if (crash) {
           System.out.print("Will crash on bridge " + bridgeHit);
       } else {
           System.out.print("Will not crash");
       }

    }
}