package managebooks;

public class ManageBooksController {

    private ManageBooksView manageBooksView;
    private ManageBooksModel manageBooksModel;

    ManageBooksController(ManageBooksView manageBooksView) {
        this.manageBooksView=manageBooksView;
        manageBooksModel = new ManageBooksModel(this);
    }

    void addDetails(String bookName) {
        manageBooksModel.addDetails(bookName);
    }

     void borrowSuccess(String bookName) {
        manageBooksView.borrowSuccess(bookName);
    }
}
