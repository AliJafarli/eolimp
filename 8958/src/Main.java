import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                count++;
            }

        }
        if (count <= 0) {
            System.out.println("NO");
        } else {

            System.out.println(count);


            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.print(array[i] + " ");
                }


            }

        }
    }
}