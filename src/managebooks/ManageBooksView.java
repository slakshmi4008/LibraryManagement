package managebooks;

import java.util.Scanner;

public class ManageBooksView {

    private ManageBooksController manageBooksController;
    Scanner scanner = new Scanner(System.in);

    ManageBooksView(){
        manageBooksController = new ManageBooksController(this);
    }

    public static void main(String[] args) {
        ManageBooksView manageBooksView =new ManageBooksView();
        manageBooksView.addBooks();
    }

    private void addBooks() {
        System.out.println("\"Welcome to add books page\\n ------------------------\"");
        System.out.println("Enter the book name");
        String bookName = scanner.next();
        manageBooksController.addDetails(bookName);
    }

    void borrowSuccess(String bookName) {
        System.out.println("You have successfully borrowed the book "+ bookName);
    }
}
