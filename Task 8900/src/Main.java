import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

while(true) {
    n++;
    if (n % 7 == 0 ) {
        System.out.println(n);
        break;
    }
}

    }
}