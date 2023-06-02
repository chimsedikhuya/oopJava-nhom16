// Class chứa hàm main để chạy thực thi
public class App {
    public static void main(String[] args) {
        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.nhapThongTin(10);  // Nhập giá trị Integer
        concreteObj.nhapThongTin("Hello");  // Nhập giá trị String
        concreteObj.nhapThongTin(3.14);  // Nhập giá trị Double

        concreteObj.themThongTin();
        concreteObj.xuatThongTin();
        concreteObj.hienThi();
    }
}
