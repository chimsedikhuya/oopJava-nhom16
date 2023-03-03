import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 so nguyen duong :");
            int x = sc.nextInt();
            sum += x; 
        }
        while (sum <= 100);
        sc.close();
        System.out.println("Tong da lon hon 100,gia tri cua tong la:" + sum);
    }
}