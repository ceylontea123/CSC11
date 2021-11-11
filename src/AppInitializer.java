/*
  @author Pasan Abeysekara <pasan.lahiru123@gmail.com> (www.pasanabeysekara.com)
 * @since 10/21/2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("/view/CustomerRegisterForm.fxml");
        Parent load = FXMLLoader.load(Objects.requireNonNull(resource));
        Scene scene = new Scene(load);
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Doobie Marijuana Distribution System");
    }
}
