import controller.*;
import db.DataLoader;


public class MainForMVC {

    public static void main (String[] args)
    {
        //Loads up the database to be accessed by the controller.
        new DataLoader();

        //Controls the flow of app
        AppController app = new AppController();

        //Boots up the app
        app.init();

    }
    
}
