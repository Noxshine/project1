package huyhoang;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstApp extends Application {
    private  int x = 1;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Button btn = new Button("Click");
        Label lb = new Label();
        btn.setOnAction(event -> {
            if(x == 1) {
                lb.setText("HIHI");
                x = 2;
            } else {
                x = 1;
                lb.setText("sdgufgsuhdfbvd");
            }
        });
        vbox.getChildren().addAll(lb, btn);
        Scene scene = new Scene(vbox, 300, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void runApp() {
        launch();
    }
}
