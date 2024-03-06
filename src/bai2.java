import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chieu dai: ");
        float a = sc.nextFloat();
        System.out.print("Nhập vào chieu rong: ");
        float b = sc.nextFloat();
        System.out.println("Chu vi: " + (a + b)*2);
        System.out.print("Dien tich: " + (a * b));
    }
}
