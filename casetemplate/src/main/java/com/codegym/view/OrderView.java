package com.codegym.view;

import com.codegym.model.Book;
import com.codegym.model.Order;
import com.codegym.model.OrderItem;
import com.codegym.service.IBookService;
import com.codegym.service.IOrderService;
import com.codegym.service.file.BookServiceWithFile;
import com.codegym.service.file.OrderServiceWithFile;
import com.codegym.utils.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    private IOrderService iOrderService;
    private IBookService iBookService;
    private Scanner scanner = new Scanner(System.in);

    public OrderView() {

        iOrderService = new OrderServiceWithFile();
        iBookService = new BookServiceWithFile();
    }
    public void launcher() {
            Scanner scan = new Scanner(System.in);
            boolean checkActionMenu = true;
            do {
                System.out.println("Menu quản lý order: ");
                System.out.println("Nhấn 1. Xem danh sách order");
                System.out.println("Nhấn 2. Xem chi tiết order");
                System.out.println("Nhấn 3. Tạo order");
                System.out.println("Nhấn 4. Xóa order");
                int actionMenu = Integer.parseInt(scan.nextLine());
                switch (actionMenu) {
                    case 2:
                        showOrderDetailView();
                        break;
                    case 3:
                        createOrder();
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

    private void createOrder() {
        BookView bookView = new BookView();
        bookView.showBooks();

        Order order = new Order();
        order.setId(System.currentTimeMillis()/1000);

        boolean checkActionAddToOrder = true;
        do{
            System.out.println("Nhập ID Book");
            long idBook = Long.parseLong(scanner.nextLine());
            Book book = iBookService.findBookById(idBook);
            if (book == null) {
                System.out.println("ID Book không đúng vui lòng nhập lại");
                continue;
            }else {
                System.out.println("Nhập số lượng: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                // kiểm tra số lượng có hợp lệ hay không

                boolean checkExistsInOrder = checkIdBookExistsOrder(idBook, order);
                if (checkExistsInOrder) {// true: cập nhật lại số lượng
                    updateBookInOrder(book, quantity, order);
                }else{// false: thêm sản phẩm vào order
                    addBookToOrder(book,quantity, order);
                }
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue) {
                    case "Y":
                        checkActionAddToOrder = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionAddToOrder = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            }while (checkActionMenuContinue) ;

        }while (checkActionAddToOrder);

        order.updateTotal();

        System.out.println("Nhập tên người mua hàng: ");
        String fullName = scanner.nextLine();
        order.setFullName(fullName);
        order.setCreateAt(new Date());

        iOrderService.addOrder(order);

        showOrderDetail(order);

    }

    private void updateBookInOrder(Book book, int quantity, Order order) {
        for (int i = 0; i < order.getOrderItems().size(); i++) {
            if (order.getOrderItems().get(i).getIdBook() == book.getId()) {
                order.getOrderItems().get(i).setQuantity(quantity);
            }
        }
    }

    private void addBookToOrder(Book book, int quantity, Order order) {
        //(long id, long idOrder, long idBook, int quantity, double price)
        OrderItem orderItem = new OrderItem(System.currentTimeMillis() / 1000,
                order.getId(), book.getId(), quantity, book.getPrice());
        if (order.getOrderItems() == null) {
            List<OrderItem> orderItems = new ArrayList<>();
            orderItems.add(orderItem);

            order.setOrderItems(orderItems);
        }else{
            order.getOrderItems().add(orderItem);

        }
    }

    private boolean checkIdBookExistsOrder(long idBook, Order order) {
        if (order.getOrderItems() != null) {
            for (int i = 0; i < order.getOrderItems().size(); i++) {
                if (order.getOrderItems().get(i).getIdBook() == idBook) {
                    return true;
                }
            }
        }
        return false;
    }


    private void showOrderDetailView() {
        System.out.println("Nhập mã hóa đơn bạn muốn xem: ");
        long idOrder = Long.parseLong(scanner.nextLine());
        Order order = iOrderService.findOrderById(idOrder);
        showOrderDetail(order);


    }

    private void showOrderDetail(Order order) {
        System.out.printf("%15s %10s %10s\n", order.getFullName(), DateUtils.formatDate(order.getCreateAt()),
                order.getTotal());

        for (int i = 0; i < order.getOrderItems().size(); i++) {
            OrderItem orderItem = order.getOrderItems().get(i);

            Book book = iBookService.findBookById(orderItem.getIdBook());
            System.out.printf("%10s x %5s %10s\n", book.getName(), orderItem.getQuantity(), (orderItem.getQuantity()*orderItem.getPrice()));
        }
        System.out.printf("%30s", order.getTotal());
    }
}
