import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        boolean condOne = (m * n) >= k;
        boolean condTwo = (k % m == 0) || (k % n == 0);

        if (condOne && condTwo) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}