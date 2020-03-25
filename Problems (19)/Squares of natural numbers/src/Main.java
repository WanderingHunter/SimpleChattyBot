import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = scanner.nextInt();
        int square = 1;

        while (square <= num) {
            int i = 1;
            square = i * i;
            System.out.println(square);
            i++;
         }
    }
}