package com.codegym.view;

import com.codegym.BookStore;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);
    private BookStore bookStore;

    public MenuView() {

    }


    public MenuView(BookStore bookStore) {
        this.bookStore = bookStore;
    }
    public void showMenuAdmin() {
        Scanner scan = new Scanner(System.in);
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu admin: ");
            System.out.println("Nhấn 1. Quản lý sách");
            System.out.println("Nhấn 2. Quản lý khách hàng");
            System.out.println("Nhấn 3. Quản lý hóa đơn");

            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    bookStore.getBookView().launcher();
                    break;
                case 2:
                    bookStore.getCustomerView().launcher();
                    break;
                case 3:
                    bookStore.getOrderView().launcher();
                    break;

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
    public void showMenuCustomer() {
        Scanner scan = new Scanner(System.in);
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu khách hàng: ");
            System.out.println("Nhấn 1. Đặt hàng");
            System.out.println("Nhấn 2. Xem thông tin");

            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    bookStore.getOrderView().launcher();
                    break;
                case 2:
                    bookStore.getBookView().launcher();
                    break;
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

    public void showMenuGuest() {
        Scanner scan = new Scanner(System.in);
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu guest: ");
            System.out.println("Nhấn 1. Xem thông tin sách");

            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    bookStore.getBookView().launcher();
                    break;
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
}
