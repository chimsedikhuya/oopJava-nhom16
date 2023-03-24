import java.util.Scanner;

public class Hinhtrutron {
    float bk;
    float cv;
    final float pi = 3.14f;
    float dttp;
    float dtxq;
    float cc;
    float tt;
    Scanner sc = new Scanner(System.in);
    public void nhapbankinh()
    {
        System.out.println("Nhap ban kinh vao");
        bk = sc.nextFloat();
    }

    public void nhapchieucao()
    {
        System.out.println("Nhap ban kinh vao");
        cc = sc.nextFloat();
    }

    public void tinhchuvi() {
        cv = 2 * pi * bk;
    }

    public void tinhdientichxungquanh() {
        dtxq = 2 * pi * bk * cc;
    }

    public void tinhdientichtoanphan() {
        dttp = dtxq + 2 * pi * bk * bk;
    }

    public void tinhthetich() {
        tt = pi * bk * bk * cc ;
    }

    public void hienthithongtinhinhtron() {
        System.out.println("ban kinh hinh tron la" + bk);
        System.out.println("chu vi hinh tron la" + cv);
        System.out.println("dien tich xung quanh hinh tron la" + dtxq);
        System.out.println("dien tich toan phan tron la" + dttp);
        System.out.println("the tich hinh tron la" + tt);
    }
}
