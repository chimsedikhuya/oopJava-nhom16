// Class kế thừa từ lớp ở câu 1 và bổ sung thuộc tính
class SubClass extends TNTA104Object {
    private boolean booleanValue;

    // Phương thức ghi đè (override) lại phương thức nhapThongTin
    @Override
    public void nhapThongTin(Object obj) {
        if (obj instanceof Boolean) {
            booleanValue = (Boolean) obj;
        } else {
            // Gọi phương thức của lớp cha để xử lý các kiểu dữ liệu khác
            super.nhapThongTin(obj);
        }
    }

    // Phương thức ghi đè (override) lại phương thức hienThi
    @Override
    public void hienThi() {
        // Gọi phương thức của lớp cha để hiển thị thông tin ban đầu
        super.hienThi();
        System.out.println("Boolean Value: " + booleanValue);
    }
}

// Class chứa hàm main để chạy thực thi
public class App {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
        subObj.nhapThongTin(10);  // Input an Integer value
        subObj.nhapThongTin("Hello");  // Input a String value
        subObj.nhapThongTin(3.14);  // Input a Double value
        subObj.nhapThongTin(true);  // Input a Boolean value

        subObj.suaThongTin();
        subObj.xemThongTin();
        subObj.hienThi();
    }
}
