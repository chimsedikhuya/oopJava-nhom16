import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // So sánh hai số và in ra số nhỏ nhất
        if (num1 < num2) {
            System.out.println("Số nhỏ nhất là: " + num1);
        } else {
            System.out.println("Số nhỏ nhất là: " + num2);
        }

        scanner.close();
    }
}