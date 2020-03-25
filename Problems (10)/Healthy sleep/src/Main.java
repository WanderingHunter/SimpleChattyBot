import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt(); // At least A hours x day
            int B = scanner.nextInt(); // No more than B x day
            int H = scanner.nextInt(); // Ann's actual sleep
        if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");

        } else {
            System.out.println("Normal");
        }
    }
}