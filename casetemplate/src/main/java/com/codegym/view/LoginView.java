package com.codegym.view;

import com.codegym.BookStore;
import com.codegym.model.ERole;
import com.codegym.model.User;
import com.codegym.service.IUserService;
import com.codegym.service.file.UserService;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner = new Scanner(System.in);
    private IUserService iUserService;
    private BookStore bookStore;
    public LoginView() {

    }
    public LoginView(BookStore bookStore) {
        this.bookStore = bookStore;
        init();
    }
    public void init() {
        iUserService = new UserService();
    }
    public void launcher() {
        Scanner scan = new Scanner(System.in);
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu login: ");
            System.out.println("Nhấn 1. Đăng nhập admin");
            System.out.println("Nhấn 2. Trang khách hàng");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    login();
                    break;
                case 2:
                    User user = new User();
                    user.setRole(ERole.GUEST);
                    bookStore.setUser(user);
                    showCustomerMenu();
                    break;
                default:
                    System.out.println("Nhập sai rồi bạn ơi! Vui lòng nhập lại");
            }

        } while (checkActionMenu);
    }

    private void showCustomerMenu() {
        bookStore.getMenuView().showMenuCustomer();
    }

    private void login() {
        boolean checkActionLogin = false;
        do{
            System.out.println("Đăng nhập");
            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            User user = iUserService.checkUsernamePassword(username, password);
            if (user!=null) {
                bookStore.setUser(user);
                if (user.getRole().equals(ERole.ADMIN)) {
                    bookStore.getMenuView().showMenuAdmin();
                }else{
                    bookStore.getMenuView().showMenuCustomer();
                }
            }else{
                System.out.println("Thông tin đăng nhập chưa đúng.");
                boolean checkActionMenuContinue = true;
                do {
                    System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                    String actionMenuContinue = scanner.nextLine();
                    switch (actionMenuContinue) {
                        case "Y":
                            checkActionLogin = true;
                            checkActionMenuContinue = false;
                            break;
                        case "N":
                            checkActionLogin = false;
                            checkActionMenuContinue = false;
                            break;
                        default:
                            checkActionMenuContinue = true;
                    }
                }while (checkActionMenuContinue) ;
            }
        }while (checkActionLogin);

    }
}
