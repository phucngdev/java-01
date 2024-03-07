import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào so 1: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào so 2: ");
        int b = sc.nextInt();
        System.out.print("Nhập vào so 3: ");
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.printf("max: %d", max);

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.printf("\nmin: %d", min);
    }
}
