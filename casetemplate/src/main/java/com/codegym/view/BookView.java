package com.codegym.view;

import com.codegym.comparator.ComparatorById;
import com.codegym.comparator.ComparatorByName;
import com.codegym.comparator.ComparatorByPrice;
import com.codegym.model.Book;
import com.codegym.service.file.BookServiceWithFile;
import com.codegym.service.IBookService;
import com.codegym.utils.ValidateUtils;

import java.util.*;

public class BookView {
//    private Book [] books;
    private IBookService bookService;

    private Scanner scanner = new Scanner(System.in);
    public BookView() {
        // Ở đây áp dụng tính chất gì:
        bookService = new BookServiceWithFile();
    }
    public void showBooks(){
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "ID", "Name", "Description", "Date", "Price");
        for (int i = 0; i < bookService.getAll().size(); i++) {
            Book book  =  bookService.getAll().get(i);
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n",
                    book.getId(),book.getName(),book.getDescription(),
                    book.getEntryDate(), book.getPrice());
        }
    }

    public void showBooks(List<Book> books) {
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "ID", "Name", "Description", "Date", "Price");
        for (int i = 0; i < books.size(); i++) {
            Book book  =  books.get(i);
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n",
                    book.getId(),book.getName(),book.getDescription(),
                    book.getEntryDate(), book.getPrice());
        }
    }

    public void inputBookName(Book book) {
        String name;
        boolean checkValid = false;
        do {
            System.out.println("Nhập tên sách:");
            name = scanner.nextLine();

            checkValid = ValidateUtils.isValidBookName(name);
            if (checkValid == false) {
                System.out.println("Tên không hợp lệ, vui lòng nhập lại. Tên phải từ 8-20 kí tự và bắt đầu bằng chữ cái");
            }
        } while (!checkValid);
        book.setName(name);
    }

    public void inputBookDescription(Book book) {
        String description;
        boolean checkValid = false;
        do {
            System.out.println("Nhập mo tả: ");
            description = scanner.nextLine();
            checkValid = ValidateUtils.isValidBooDescription(description);
            if (!checkValid) {
                System.out.println("Mô tả không hợp lệ, vui lòng nhập lại. Mô tả phải từ 8-100 kí tự và bắt đầu bằng chữ cái");
            }
        } while (!checkValid);

        book.setDescription(description);
    }

    public void inputBookPrice(Book book) {
        double price = 0;
        boolean checkValid = false;
        do {
            System.out.println("Nhập giá");
            try {
                price = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Giá không hợp lệ vui lòng nhập lại! Giá từ 0-5.000.000đ");
                price = 0;
                continue;
            }
            checkValid = ValidateUtils.isValidPrice(price);     // false
            if (checkValid==false) {
                System.out.println("Giá không hợp lệ vui lòng nhập lại! Giá từ 0-5.000.000đ");
            }
        } while (checkValid==false);

        book.setPrice(price);
    }
    public void addBook(){
        Book book = new Book();
        System.out.println("Nhập thông tin sách:");

        inputBookName(book);
        inputBookDescription(book);
        inputBookPrice(book);

        Comparator comparator = new ComparatorById();

        List<Book> books = bookService.getAll();
        books.sort(comparator);
        long maxId = books.get(books.size()-1).getId();

        book.setId(maxId + 1);
        book.setEntryDate(new Date());

        books.add(book);
        showBooks();

    }

    public void editBook(){
        System.out.println("Nhập ID bạn muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập tên mới: ");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập mô tả mới: ");
        String descriptionNew = scanner.nextLine();
        System.out.println("Nhập giá mới: ");
        double priceNew = Double.parseDouble(scanner.nextLine());

        //long id, String name, String description, Date entryDate, double price
        Book bookNew = new Book(id, nameNew, descriptionNew,new Date(), priceNew);
        bookService.updateBookById(id, bookNew);

        showBooks();
    }

    public void deleteBook() {
        System.out.println("Nhập sách bạn muốn xóa: ");
        long id = Long.parseLong(scanner.nextLine());

        bookService.deleteBookById(id);
        showBooks();
    }


    public void launcher() {
        Scanner scan = new Scanner(System.in);
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý sách: ");
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
                    showBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    sortByName();
                    break;
                case 7:
                    searchByName();
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

    private void searchByName() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Book> results = new ArrayList<>();

        List<Book> books = bookService.getAll();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getName().contains(kw)){
                results.add(books.get(i));
            }
        }
        showBooks(results);
    }

    private void sortByName() {
        List<Book> books = bookService.getAll();
        books.sort(new ComparatorByName());
        showBooks();
    }

    private void sortByPrice() {
//        Comparator comparator = new ComparatorByPrice();
        List<Book> books = bookService.getAll();
        books.sort(new ComparatorByPrice());
        showBooks();
    }

}
