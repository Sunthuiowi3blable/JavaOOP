package BTJAVAOOP2.person;

public class Person {

    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Person(String name, String phone, String address, String gender, int age) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //    public String getName(){
//        return name;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public String getGender(){
//        return gender;
//    }
//
//    public String getAddress(){
//        return address;
//    }
//
//    public String getPhone(){
//        return phone;
//    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(phone);
    }

    public static void main(String[] args) {
        Person person = new Person("Đỗ Minh Huyền", "0123456789", "Hà Nội", "Nữ", 22 );
        person.showInfo();
    }


}
