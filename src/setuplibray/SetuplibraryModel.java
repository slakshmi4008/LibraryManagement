package setuplibray;

public class SetuplibraryModel {

    private SetuplibraryController setuplibraryController;

    public SetuplibraryModel(SetuplibraryController setuplibraryController){
        this.setuplibraryController = setuplibraryController;
    }

    void addDetails(String name,String address) {
        setuplibraryController.addSuccess(name);
    }
}
