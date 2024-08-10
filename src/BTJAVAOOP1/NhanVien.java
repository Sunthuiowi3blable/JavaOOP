package BTJAVAOOP1;

public class NhanVien {
    static String name = "Đỗ Minh Huyền";
    static int age = 22;
    static String address = "Hà Nội";

    public static String getName(){
        return name;
    }

    public static int getAge(){
        return age;
    }

    public static String getAddress(){
        return address;
    }

    public void getInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }

    public static void main(String[] args) {
        NhanVien info = new NhanVien();
        info.getInfo();
    }
}
