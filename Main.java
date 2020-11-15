package animalrescuediderot;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Main extends Application {
    /*public void start(Stage PrimaryStage) throws IOException {
        InputStream stream = new FileInputStream("src/animalrescuediderot/assets/square.jpg");
        Image image = new Image(stream);
        ImageView [][] imageView = new ImageView[8][8];
        Group root = new Group();
        HBox h = new HBox(8);
        h.setSpacing(5);
        for(int i = 0; i < 8; i++) {
            for (int j=0;j<8;j++){
                imageView[i][j] = new ImageView();
                imageView[i][j].setImage(image);
                h.getChildren().add(imageView[i][j]);
            }

        }
        root.getChildren().add(h);
        Scene scene = new Scene(root, 500, 500);
        PrimaryStage.setTitle("Displaying Image");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        //CURRENT WORKING DIRECTORY : System.out.println(System.getProperty("user.dir"));
    }*/

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root=FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Manissa");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }


}