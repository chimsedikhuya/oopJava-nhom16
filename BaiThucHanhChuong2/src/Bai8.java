import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap luong so nguyen:");
        int n = scanner.nextInt();

        int sum = 0 ;
        int i ;
        for (i = 0; i < n ; i++) {
            System.out.println("Nhap so nguyen tiep theo:");
            int num = scanner.nextInt();
            sum += num; 
        }

        double tbc = (double) sum / n;
        System.out.println("Trung binh cong cua" + n + "so nguyen la" + tbc);
        scanner.close();
    }
}