import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 1;

        switch (shape) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
                break;
            case "rectangle":
                double a2 = scanner.nextInt();
                double b2 = scanner.nextInt();
                area = a2 * b2;
                break;
            case "circle":
                double r = scanner.nextInt();
                area = Math.pow(r, 2) * 3.14;
                break;
        }
        System.out.print(area);

    }
}