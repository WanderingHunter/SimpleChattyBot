import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Queen #1
        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        // Queen #2
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        // Result Boolean
        boolean result = false;

        // Same horizontal row, same x coord
        // Same vertical row, same y coord
        if ((x1 == x2) || (y1 == y2)) {
            result = true;
        }
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)){
            result = true;
        }
        if (result) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }


    }
}