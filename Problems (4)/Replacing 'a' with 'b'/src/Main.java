import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanInput = scanner.nextLine();
        System.out.print(scanInput.replace("a", "b"));
    }
}