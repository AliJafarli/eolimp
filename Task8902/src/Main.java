import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (true) {
            n++;
            if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
                System.out.println(n);
                break;
            }
        }

    }
}