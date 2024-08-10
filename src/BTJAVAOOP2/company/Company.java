package BTJAVAOOP2.company;

import BTJAVAOOP2.person.Person;

public class Company extends Person {

    public Company(String name, String gender, int age) {
        super(name, age, gender);
    }

    public static void main(String[] args) {
        Company company = new Company("Minh Huyền", "Nữ", 22);
        company.showInfo();

    }
}
