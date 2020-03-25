import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str1Uppercase = str1.toUpperCase();
        System.out.println(str1Uppercase.startsWith("J"));
    }
}