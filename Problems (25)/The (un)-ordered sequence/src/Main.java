import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        boolean isOrdered = true;
        String direction = "";

        while ((secondInt != 0) && isOrdered) {
            if ((firstInt < secondInt) && direction.equals("")) {
                direction = "asc";
            } else if ((secondInt < firstInt) && direction.equals("")) {
                direction = "desc";
            } else if ((firstInt < secondInt) && direction.equals("desc")) {
                isOrdered = false;
            } else if ((secondInt < firstInt) && direction.equals("asc")) {
                isOrdered = false;
            }
            firstInt = secondInt;
            secondInt = scanner.nextInt();
        }
        System.out.print(isOrdered);
    }
}
