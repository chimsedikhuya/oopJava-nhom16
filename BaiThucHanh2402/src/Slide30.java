import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int n = scanner.nextInt();

        int sum = 0;

        scanner.close();

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Tổng các chữ số của số vừa nhập là: " + sum);
    }
}