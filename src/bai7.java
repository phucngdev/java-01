import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào so có 4 chư so: ");
            n = sc.nextInt();
            if (n < 999 || n > 10000) {
                System.out.println("Nhap sai!");
            }
        } while (n < 999 || n > 10000);
        System.out.printf("so nghich dao cua %d: ", n);
        int total = 0;
        for ( ; n != 0 ; n /= 10) {
            total += n % 10;
            System.out.print(n % 10);
        }
        System.out.println("\nTong cua so: " + total);


    }
}
