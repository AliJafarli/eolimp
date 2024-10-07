import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number: ");
        int n = sc.nextInt();
        if (n == 7) {
            System.out.println("yes");
        } else if (n == 8) {
            System.out.println("no");
        } else {
            System.out.println("wrong number ");
        }
    }
}