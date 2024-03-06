import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào ban kinh: ");
        float r = sc.nextFloat();
        System.out.printf("Chu vi: %.2f", (2 * Math.PI * r));
        System.out.printf("\nDien tich: %.2f", (Math.PI * r * r));
    }
}
