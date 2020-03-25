import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsA = scanner.nextInt();
        int studentsB = scanner.nextInt();
        int studentsC = scanner.nextInt();

        int desksA = (studentsA / 2) + (studentsA % 2);
        int desksB = (studentsB / 2) + (studentsB % 2);
        int desksC = (studentsC / 2) + (studentsC % 2);

        int total = desksA + desksB + desksC;
        System.out.println(total);
    }
}