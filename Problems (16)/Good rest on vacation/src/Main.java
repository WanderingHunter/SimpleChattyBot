import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int days = scanner.nextInt();
        final int nights = days - 1;
        final int foodCostPerDay = scanner.nextInt();
        final int flightCost = scanner.nextInt();
        final int hotelNightCost = scanner.nextInt();

        final int totalSum = 2 * flightCost + nights * hotelNightCost + days * foodCostPerDay;

        System.out.println(totalSum);
    }
}