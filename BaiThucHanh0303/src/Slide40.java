import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        System.out.println("\"Hay nhap vao so nguyen duong gia tri tuong ung 1: chu nhat 2: thu hai 3: thu ba 4: thu tu ... \" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int ngay = scanner.nextInt();
        scanner.close();

        switch(ngay){
            case 1 : 
                System.out.println("Day la ngay chu nhat");
                break; 
            case 2 : 
                System.out.println("Day la ngay thu 2");
                break;
            case 3 : 
                System.out.println("Day la ngay thu 3");
                break;
            case 4 : 
                System.out.println("Day la ngay thu 4");
                break;    
            case 5 : 
                System.out.println("Day la ngay thu 5");
                break; 
            case 6 : 
                System.out.println("Day la ngay thu 6");
                break;  
            case 7 : 
                System.out.println("Day la ngay thu 7");
                break;  
            default :
                System.out.println("Day k phai ngay trong tuan");                  
        }
    }
}

