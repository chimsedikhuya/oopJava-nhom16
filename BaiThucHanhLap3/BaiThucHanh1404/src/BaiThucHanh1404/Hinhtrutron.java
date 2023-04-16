package BaiThucHanh1404;
import java.util.Scanner;

public class Hinhtrutron {
    public float bk ;
    final float Pi = 3.14f;
    public float chieucao;
    public float chuvi;
    public float dientich;
    public float thetich;
    
    public void nhapbankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhap ban kinh:");
        bk = sc.nextFloat();
    }
    public void nhapchieucao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao:");
        chieucao = sc.nextFloat();
    }
    public float tinhchuvi()
    {
       chuvi = 2*Pi*chieucao*bk*chieucao;
       return chuvi;
    }
    public float tinhdientich()
    {
        dientich = 2*Pi*bk+(bk+chieucao);
        return dientich;

    }
    public float tinhthetich()
    {
        thetich = Pi*bk*bk*chieucao;
        return thetich;
    }
    public void hienthithongtin()
    {
        System.out.printf("chu vi hinh tru tron la: %f",tinhchuvi());
        System.out.printf("\n dien tich hinh tru tron la: %f",tinhdientich());
        System.out.printf("\nthe tich hinh tru tron la: %f",tinhthetich());
    
    }



}
