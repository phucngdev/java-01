
import java.time.LocalDateTime;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, y, yn;
        LocalDateTime localDate = LocalDateTime.MAX.now();
        yn = localDate.getYear();
        do {
            System.out.print("Nhap vao nam sinh: ");
            y = sc.nextInt();
            if (y > yn) {
                System.out.println("Nam sinh khong hop le");
            }
        } while ( y > yn);
        t = yn - y;
        System.out.println("so tuoi: " + t);
        if (t % 2 != 0) {
            System.out.println("tuoi le");
        } else {
            System.out.println("tuoi chan");
        }
    }
}
