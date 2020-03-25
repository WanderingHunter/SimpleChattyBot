import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aBC = (a + b) > c;
        boolean bCA = (b + c) > a;
        boolean cAB = (c + a) > b;

        if (aBC && bCA && cAB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}