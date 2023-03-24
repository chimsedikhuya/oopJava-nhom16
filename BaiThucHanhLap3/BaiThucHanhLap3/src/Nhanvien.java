import java.util.Scanner;

public class Nhanvien {
    String hoten;
    int tuoi;
    float hsl;
    float luongcb = 1490000;
    float luong; 
    
    Scanner sc = new Scanner(System.in);
    public void nhapthongtin(){
        System.out.println("Nhap ten ho nhan vien : ");
        hoten = sc.nextLine();
        System.out.println("Nhap so tuoi nhan vien : ");
        tuoi = sc.nextInt();
    }

    public void nhaphesoluong(){
        System.out.println("Nhap he so luong cho nhan vien : ");
        hsl = sc.nextFloat();
    }

    public void ptluongnhanvien(){
        luong = luongcb * hsl;
    }

    public void hienthithongtin(){
        System.out.printf("Nhan vien %s - %d tuoi co muc luong la %f" ,hoten, tuoi, luong );
    }
}
