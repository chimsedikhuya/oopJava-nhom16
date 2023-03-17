import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        System.out.println("Nhap vao so nguyen duong:");
        number = scanner.nextInt();

        long giaithua = 1;
        int i = 1 ; 
        do {
            giaithua *= i;
            i++;
        }
        while (i <= number );
        System.out.println("giai thua cua" + number + "!=" + giaithua);
    }
}