import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();

        // Определяем количество цифр в n
        int digitCount = 0;
        int temp = n;

        // Считаем количество цифр
        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }

        // Наименьшее число с digitCount + 1 цифрами
        long result = (long) Math.pow(10, digitCount);

        System.out.println("Наименьшее натуральное число с более чем " + digitCount + " цифрами: " + result);
    }
}
