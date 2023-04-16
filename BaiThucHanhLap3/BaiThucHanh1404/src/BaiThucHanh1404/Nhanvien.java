package BaiThucHanh1404;
import java.util.Scanner;

public class Nhanvien {
    public String hoten;
    public int tuoi;
    public int luongcoban = 14900000;
    public float hesoluong;

   public void nhapthongtinnv ()
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhap ho va ten:");
    hoten = sc.nextLine();
    System.out.print("Nhap tuoi:");
    tuoi = sc.nextInt();
    System.out.print("Nhap he so luong:");
    hesoluong = sc.nextFloat();
    sc.close();
   }
   public float tinhluong(float hesoluong) 
{
    return (float) hesoluong * luongcoban;
}

   public void inthongtin()
   {
    System.out.printf("Ten: %s - %d ",hoten,tuoi);
    System.out.printf("\n Luong cua nhan vien la %f:", Math.ceil(tinhluong(hesoluong)));
   }
}
