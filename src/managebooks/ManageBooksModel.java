package managebooks;

public class ManageBooksModel {

    private ManageBooksController manageBooksController;
    public ManageBooksModel(ManageBooksController manageBooksController) {
        this.manageBooksController=manageBooksController;
    }

    void addDetails(String bookName) {
        manageBooksController.borrowSuccess(bookName);
    }
}
