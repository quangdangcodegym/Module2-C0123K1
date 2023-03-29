package document_manager;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DocumentManager {
    private Scanner scanner = new Scanner(System.in);
    private Document [] documents;

    public DocumentManager() {
        documents = new Document[5];
        // Đang dùng tính chất gì đây:      ???
        //id, int releaseNumber, String author, int pageNumber
        documents[0] = new Book(1L, 10, "Minh Hiếu", 100);
        //long id, int releaseNumber, Date release
        documents[1] = new Newspaper(2L, 100, new Date());
        documents[2] = new Book(3L, 10, "Bảo Thi", 100);
        documents[3] = new Newspaper(4L, 100, new Date());
        documents[4] = new Newspaper(5L, 100, new Date());

    }
    public void addDocument() {
        System.out.println("Nhập Sách:");
        System.out.println("Nhập tên tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Nhập số trang: ");
        int pageNumber = scanner.nextInt();
        System.out.println("Nhập số bản phat hành: ");
        int releaseNumber = scanner.nextInt();

        int maxId = documents.length + 1;
        Book book = new Book(maxId, releaseNumber, author, pageNumber);
        Document[] arrNew = Arrays.copyOf(documents, documents.length + 1);
        arrNew[arrNew.length-1] = book;

        documents = arrNew;

    }

    public void deleteDocument() {
        System.out.println("Nhập vào ID cần xóa:");
        long id = scanner.nextLong();
        int index = -1;
        for (int i = 0; i < documents.length; i++) {
            if (documents[i].getId() == id) {
                index = i;
                break;
            }
        }
    }

    public void showDocument() {
        for (int i = 0; i < documents.length; i++) {
            // documents[i]: Kiểu Document
            System.out.println(documents[i].toString());
        }
    }

    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        documentManager.showDocument();

        documentManager.addDocument();

        documentManager.showDocument();
    }

}
