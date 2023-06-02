import java.util.*;

// Abstract class hoặc interface
abstract class AbstractClass {
    // Các thuộc tính
    protected int intValue;
    protected String stringValue;
    protected double doubleValue;

    // Phương thức nhập thông tin
    public abstract void nhapThongTin(Object obj);

    // Phương thức thêm thông tin
    public abstract void themThongTin();

    // Phương thức sửa thông tin
    public abstract void suaThongTin();

    // Phương thức xuất thông tin
    public abstract void xuatThongTin();

    // Phương thức hiển thị
    public abstract void hienThi();
}

// Class triển khai từ abstract class
class ConcreteClass extends AbstractClass {
    private Set<Object> dataSet;

    public ConcreteClass() {
        dataSet = new HashSet<>();
    }

    // Phương thức nhập thông tin
    public void nhapThongTin(Object obj) {
        if (obj instanceof Integer) {
            intValue = (Integer) obj;
        } else if (obj instanceof String) {
            stringValue = (String) obj;
        } else if (obj instanceof Double) {
            doubleValue = (Double) obj;
        }
    }

    // Phương thức thêm thông tin
    public void themThongTin() {
        dataSet.add(intValue);
        dataSet.add(stringValue);
        dataSet.add(doubleValue);
    }

    // Phương thức sửa thông tin
    public void suaThongTin() {
        // Xử lý sửa thông tin
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        System.out.println("Dữ liệu trong Set:");
        for (Object obj : dataSet) {
            System.out.println(obj);
        }
    }

    // Phương thức hiển thị
    public void hienThi() {
        System.out.println("Thông tin:");
        System.out.println("Int Value: " + intValue);
        System.out.println("String Value: " + stringValue);
        System.out.println("Double Value: " + doubleValue);
    }
}


