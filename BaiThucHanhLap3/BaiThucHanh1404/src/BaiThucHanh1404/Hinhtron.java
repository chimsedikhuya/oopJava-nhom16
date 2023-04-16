package BaiThucHanh1404;
import java.util.Scanner;

public class Hinhtron {
   
    
    public float bk ;
    final float Pi = 3.14f;
    public float chuvi;
    public float dientich;
    
    public void nhapbankinh()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        bk = sc.nextInt();
     
    }
 
    public float tinhchuvi()
    {
     chuvi = 2 * Pi * bk;
    return chuvi;
    }
    public float  tinhdientich()
    {
         dientich = Pi*bk*bk;
        return dientich;
    }
    public void hienthithongtin()
    {
        System.out.printf("chu vi hinh tron la: %f",tinhchuvi());

        System.out.printf("\n dien tich hinh tron la %f",tinhdientich());
    }

    
    
}