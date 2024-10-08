import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        long result = (long) Math.pow(10, count);
        System.out.println(result);
    }
}
