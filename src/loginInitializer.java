import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class loginInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene
                (new Scene(FXMLLoader.load(getClass().getResource("view/loginForm.fxml"))));
        //primaryStage.getIcons().add(new Image("/assets/emojis/1.png"));
        primaryStage.show();

    }
}
