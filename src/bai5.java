import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        do {
            System.out.print("Nhập vào diem toan: ");
             a = sc.nextFloat();
        } while (a < 0 || a > 10);

        do {
            System.out.print("Nhập vào diem van: ");
             b = sc.nextFloat();
        } while (b < 0 || b > 10);

        do {
            System.out.print("Nhập vào diem anh: ");
             c = sc.nextFloat();
        } while (c < 0 || c > 10);

        System.out.printf("\nTong diem: %.2f", (a + b + c));
        System.out.printf("\nDiem tring binh: %.2f", (a + b + c) / 3);
    }
}
