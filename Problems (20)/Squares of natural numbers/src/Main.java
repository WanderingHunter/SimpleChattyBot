import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = scanner.nextInt();
        int i = 1;
        int square = 1;

        while (square <= maxValue) {
            square = i * i;
            i++;
            if (square <= maxValue) {
                System.out.println(square);
            }
        }
        /*Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int square = 1;
        int i = 2;

        while (square <= value) {
            System.out.println(square);
            square = i * i;

            i++;
        }*/
    }
}
