package FXMain;

import Controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    private static final Logger LOGGER = Logger.getLogger("Main");

    private Stage screen;

    private FXMLLoader loader;

    @Override
    public void start(Stage primaryStage) throws Exception{
        screen = primaryStage;
        initRootLayout(screen);
    }

    private void initRootLayout(Stage mainScreen) {
        try {
            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/MainView.fxml"));
            AnchorPane rootLayout = loader.load();

            Controller controller = loader.getController();

            Scene scene = new Scene(rootLayout);
            mainScreen.setScene(scene);
            mainScreen.show();
        } catch (IOException e) {
            //error on load, must be logged
            LOGGER.log(Level.SEVERE, "Failed to find the FXML file!");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
