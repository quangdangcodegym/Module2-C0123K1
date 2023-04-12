package com.codegym.view;

import com.codegym.service.ICustomerService;
import com.codegym.service.file.CustomerServiceWithFile;

import java.util.Scanner;

public class CustomerView {
    private ICustomerService customerService;

    public CustomerView() {
        customerService = new CustomerServiceWithFile();
    }
    public void launcher() {
        Scanner scan = new Scanner(System.in);
        BookView bookStore = new BookView();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý nhân viên: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm sách");
            System.out.println("Nhấn 3. Sửa sách");
            System.out.println("Nhấn 4. Xóa sách");
            System.out.println("Nhấn 5. Sắp xếp sách theo giá ");
            System.out.println("Nhấn 6. Sắp xếp sách theo tên ");
            System.out.println("Nhấn 7. Tìm kiếm sách theo tên");
            System.out.println("Nhấn 8. Tìm kiếm sách theo tên hoặc mô tả");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    showCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                
                default:
                    System.out.println("Nhập sai rồi bạn ơi! Vui lòng nhập lại");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "Y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            }while (checkActionMenuContinue) ;

        } while (checkActionMenu);
    }

    private void editCustomer() {
    }

    private void addCustomer() {
    }

    private void showCustomers() {
        
    }
}
