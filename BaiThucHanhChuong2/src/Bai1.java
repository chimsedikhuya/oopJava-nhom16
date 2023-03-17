import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("Tong hai so la: " + (a + b));
        System.out.println("Hieu hai so la: " + (a - b));
        System.out.println("Tich hai so la: " + (a * b));
        System.out.println("Thuong hai so la: " + (a / b));
        System.out.println("So thu nhat chia lay du cho so thu 2: " + (a % b));


        if (a-b>0){
            System.out.println("So thu nhat lon hon so thu 2: ");
        }
        else if (a-b ==0){
            System.out.println("So thu nhat bang so thu 2");
        }
        else{
            System.out.println("So thu nhat nho hon so thu 2");
        }
    }
}

