package BTJAVAOOP3.testcases;

import BTJAVAOOP3.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCRM(){
        System.out.println("Mở trình duyệt web và nhập URL https://cms.anhtester.com/login");
        System.out.println("Nhập email và password hợp lệ.");
        System.out.println("Nhấn vào nút Login để thực hiện đăng nhập.");
        System.out.println("Kiểm tra đã chuyển hướng đến được trang admin CMS");
    }

    public void testLogin(){
        createDriver();
        loginCRM();
        closeDriver();
    }

    public void testAddCategory(){
        createDriver("Edge");
        loginCRM();
        System.out.println("Nhấn menu Category đến trang list category");
        System.out.println("Nhấn nút Add New Category");
        System.out.println("Nhập đầy đủ thông tin yêu cầu cho category");
        System.out.println("Nhấn nút save");
        System.out.println("Kiểm tra category mới được thêm vào trang list category");
        closeDriver("Edge");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("==========================================");
        testCases.testAddCategory();
    }
}
