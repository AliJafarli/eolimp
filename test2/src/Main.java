import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Write number: ");
        int n = sc.nextInt();

        if (n < 0 && n > 99) {
            System.out.println("Incorrect number ");
        }
        switch (n) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dörd");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yeddi");
                break;
            case 8:
                System.out.println("səkkiz");
                break;
            case 9:
                System.out.println("doqquz");
                break;

        }
        switch (n / 10) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("iyirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("qırx");
                break;
            case 5:
                System.out.println("əlli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("səksən");
                break;
            case 9:
                System.out.println("doxsan");
                break;
        }

        switch (n % 10) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dörd");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yeddi");
                break;
            case 8:
                System.out.println("səkkiz");
                break;
            case 9:
                System.out.println("doqquz");
                break;

        }

    }
}