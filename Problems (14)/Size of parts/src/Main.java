import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int smaller = 0;
        int larger = 0;
        int perfect = 0;
        for (int i = 1; i <= size; i++) {
            int input = scanner.nextInt();
            if (input == -1) {
                smaller++;
            } else if (input == 0) {
                perfect++;
            } else if (input == 1) {
                larger++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}