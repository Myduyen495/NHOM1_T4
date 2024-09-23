import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();

        double smallest;

        // Tìm số nhỏ nhất
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Số nhỏ nhất là: " + smallest);

        scanner.close();
    }
}