package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*Label label = new Label("Music for All ");
        Button button = new Button("Uploaders");
        button.setOnAction(event -> System.out.println("TADAA!!"));
        Pane pane = new Pane();
        pane.getChildren().add(label);
        pane.getChildren().add(button);
        pane.minWidth(200);
        pane.minHeight(50);
        button.setLayoutX(45);
        button.setLayoutY(25);

        Scene scene = new Scene(pane);*/

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
