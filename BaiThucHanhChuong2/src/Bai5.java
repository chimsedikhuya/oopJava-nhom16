import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int tong = 0;
        String sum ="";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 so nguyen duong :");
            int x = sc.nextInt();
            tong += x ;
            sum =(sum +"+"+ x);  
        }
        while (tong <= 100);
        sc.close();
        System.out.print("Tong da lon hon 100,gia tri cua tong la:" + sum.substring(1));
        System.out.print("=" + tong);
    }
}
