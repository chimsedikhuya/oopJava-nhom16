package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        Ten = "Hinh Chu Nhat ";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai =");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    
    }
    public void nhapchieurong(){
        System.out.println("chieu rong =");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
         ChuVi = 2 *(dai+rong);

    }
    public void tinhdientich(){
        DienTich = dai * rong;
    }
}
