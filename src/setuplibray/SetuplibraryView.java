package setuplibray;

import java.util.Scanner;

public class SetuplibraryView {

    private  SetuplibraryController setuplibraryController;

    Scanner scanner = new Scanner(System.in);

    public SetuplibraryView(){
        setuplibraryController =new SetuplibraryController(this);
    }

    public static void main(String[] args){
        SetuplibraryView setuplibraryView = new SetuplibraryView();
        setuplibraryView.getDetails();
    }

    private void getDetails() {
        System.out.println("\"Welcome to setup library page\\n ------------------------\"");
        System.out.println("Enter your Name");
        String name = scanner.next();
        System.out.println("Enter your address");
        String address = scanner.next();
        setuplibraryController.addDetails(name,address);
    }

     void addSuccess(String name) {
         System.out.println(name+ " your data added successfully to the database");
    }
}
