package wuw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.paint.Color;

public class WUW extends Application {
    public static void main(String[] args) {
        Application.launch(WUW.class, args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("wuw.fxml"));

        stage.setTitle("WUW");
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root, 1024, 768);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }
}
