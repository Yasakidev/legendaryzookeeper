package animalrescuediderot;
import javafx.event.ActionEvent;
        import javafx.fxml.FXML;

        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.layout.AnchorPane;
        import javafx.scene.text.Text;

        import java.io.IOException;


public class Controller {

    @FXML
    public AnchorPane anchoPanePrinc;

    HelloImage[][] image = new HelloImage[8][8];

    @FXML
    public void initialize() {
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < 8; i++) {
            posY = i * 50;
            for (int j = 0; j < 8; j++) {
                posX = j * 50;
                image[i][j] = new HelloImage();
                image[i][j].setLayoutX(posX);
                image[i][j].setLayoutY(posY);
                //System.out.print("manisa"+image[i][j]);
                this.anchoPanePrinc.getChildren().add(image[i][j]);
            }
        }
    }
}