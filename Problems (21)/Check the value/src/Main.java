import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean result;

        if (input < 10 && input > 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.print(result);
    }
}