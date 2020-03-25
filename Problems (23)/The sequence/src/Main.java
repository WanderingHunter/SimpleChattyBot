import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int n = 7; debugger
        int a = n;


        for (int i = 1; i <= n; i++) {

            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
                a--;
                if (a == 0) {
                    break;
                }
            }
            if (a == 0) {
                break;
            }
        }
    }
}