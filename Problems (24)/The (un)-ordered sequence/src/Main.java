import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        boolean isOrdered = true;
        String direction = "";

        while (secondInt != 0) {
            if (direction.equals("")) {
                if (firstInt < secondInt) {
                    direction = "asc";
                } else if (firstInt > secondInt) {
                    direction = "desc";
                } else {
                    if (((firstInt < secondInt) && direction.equals("desc")) || ((firstInt > secondInt) && direction.equals("asc"))) {
                        isOrdered = false;
                        break;
                    }
                }
                firstInt = secondInt;
                secondInt = scanner.nextInt();
            }
        }
        System.out.print(isOrdered);
    }
}