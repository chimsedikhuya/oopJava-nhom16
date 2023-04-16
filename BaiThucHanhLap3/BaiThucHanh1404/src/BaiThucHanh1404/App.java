package BaiThucHanh1404;
public class App {
    public static void main(String[] args) {
        Hinhtron ht1 = new Hinhtron();
        
        ht1.nhapbankinh() ; 
        ht1.tinhchuvi();
        ht1.hienthithongtin();
        ht1.tinhdientich();

        Hinhtrutron htt = new Hinhtrutron();
        
        htt.nhapbankinh() ; 
        htt.nhapchieucao();
        htt.tinhchuvi();
        htt.hienthithongtin();
        htt.tinhdientich();
        htt.tinhthetich();
        
        Nhanvien nv = new Nhanvien();
        nv.nhapthongtinnv();
        nv.inthongtin();



    }
}
