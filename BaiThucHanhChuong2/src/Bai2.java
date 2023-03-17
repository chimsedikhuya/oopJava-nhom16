import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen lon hon 0: ");
        int a = scanner.nextInt();
        scanner.close();

        if (a%2==0){
            System.out.print("So vua nhap la so chan");  
        }
        else{
            System.out.print("So vua nhap la so le");
        }
    }
}