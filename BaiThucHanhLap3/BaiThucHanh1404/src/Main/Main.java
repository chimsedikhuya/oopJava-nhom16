package Main;

import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTron;
import HinhHoc.Hinhtru;
import HinhHoc.Hinhvuong;

public class Main {
    public static void main(String[] args) {
        //hinh tron
        HinhTron ht = new HinhTron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.InChuVi();
        ht.InDienTich();
        //hinh tru
        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.InTheTich();
        hinhtru.tinhchuvi();
        hinhtru.tinhdientich();
        hinhtru.InChuVi();
        hinhtru.InDienTich();
        //hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.InChuVi();
        hcn.InDienTich();
        // hinh vuong
        Hinhvuong hv = new Hinhvuong();
        hv.xuatten();
        hv.canhHV();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.InChuVi();
        hv.InDienTich();

    }
}
