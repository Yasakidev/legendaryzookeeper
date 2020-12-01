package animalrescuediderot;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception{
            Grid main = new Grid(8,8);
            Parent root = main.getMainPane();
            primaryStage.setTitle("Manissa");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }


}