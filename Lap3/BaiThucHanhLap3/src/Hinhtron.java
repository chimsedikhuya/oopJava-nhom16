import java.io.OutputStream;
import java.util.Scanner;

public class Hinhtron {
    float bk;
    float cv;
    final float pi = 3.14f;
    float dt;
    Scanner sc = new Scanner(System.in);
    public void nhapbankinh()
    {
        System.out.println("Nhap ban kinh vao");
        bk = sc.nextFloat();
    }

    public void tinhchuvi() {
        cv = 2 * pi * bk;
    }

    public void tinhdientich() {
        dt = pi * bk * bk;
    }

    public void hienthithongtinhinhtron() {
        System.out.println("ban kinh hinh tron la" + bk);
        System.out.println("chu vi hinh tron la" + cv);
        System.out.println("dien tich hinh tron la" + dt);
    }
}
