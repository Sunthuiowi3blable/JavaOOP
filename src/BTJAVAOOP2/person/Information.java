package BTJAVAOOP2.person;

public class Information extends Person {

    public Information(String name, String phone, String address, String gender, int age) {
        super(name, phone, address, gender, age);
    }

    public static void main(String[] args) {
        Information information = new Information("Đỗ Minh Huyền", "0123456789", "Hà Nội", "Nữ", 22);
        information.showInfo();
    }
}
