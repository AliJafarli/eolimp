import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count = 0;
        while (true) {
            long n = scanner.nextInt();
            if (n < 0) {
                count++;
            }

            else if (n == 0) {
                break;
            }


        }

        System.out.println(count);
    }
}