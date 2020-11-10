package animalrescuediderot;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Main extends Application {
    public void start(Stage stage) throws IOException {
        InputStream stream = new FileInputStream("src/animalrescuediderot/assets/square.jpg");
        Image image = new Image(stream);
        ImageView [] imageView = new ImageView[8];
        Group root = new Group();
        HBox h = new HBox();
        h.setSpacing(5);
        for(int i = 0; i < 8; i++) {
            imageView[i] = new ImageView();
            imageView[i].setImage(image);
            h.getChildren().add(imageView[i]);
        }
        root.getChildren().add(h);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Displaying Image");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
        //CURRENT WORKING DIRECTORY : System.out.println(System.getProperty("user.dir"));
    }
}