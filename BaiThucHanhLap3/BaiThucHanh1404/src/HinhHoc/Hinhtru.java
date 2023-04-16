package HinhHoc;

import java.util.Scanner;

public class Hinhtru extends HinhTron {
    public Hinhtru(){
        Ten = " hinh tru ";
    }
    public float chieucao;
    public void nhapchieucao(){
        nhapbankinh(); 
        System.out.println("chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        TheTich = DienTich * chieucao;
    }
    
}
