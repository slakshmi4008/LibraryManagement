package setuplibray;

public class SetuplibraryController {

    private SetuplibraryView setuplibraryView;
    private SetuplibraryModel setuplibraryModel;
    public SetuplibraryController(SetuplibraryView setuplibraryView) {
        this.setuplibraryView=setuplibraryView;
        this.setuplibraryModel = new SetuplibraryModel(this);

    }

    void addDetails(String name,String address) {
        setuplibraryModel.addDetails(name,address);
    }

    void addSuccess(String name) {
        setuplibraryView.addSuccess(name);
    }
}
