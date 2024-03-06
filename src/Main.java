import java.util.Scanner;

public class Main {
    // bai 1: tinh binh phuong so nguyen
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int a = sc.nextInt();
        System.out.println("a^2: " + (a * a));
    }
}