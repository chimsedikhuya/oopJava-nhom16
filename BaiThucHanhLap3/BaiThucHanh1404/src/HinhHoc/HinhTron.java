package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public HinhTron(){
        Ten = "hinh tron"; 
    }

    public float bankinh;
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban kinh =");
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        ChuVi = 2 * Pi * bankinh;

    }
    public void tinhdientich(){
        DienTich = Pi * bankinh*bankinh;
    }


    
}
