package animalrescuediderot;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.FileInputStream;


public class HelloImage extends AnchorPane {

    public ImageView image ;

    public HelloImage() {

        this.image = getImage("square.png");
        this.getChildren().add(this.image);
        this.image.setLayoutX(10);
        this.image.setLayoutY(10);
        final String cssDefault = "-fx-border-color: blue;\n"
                + "-fx-border-insets: 5;\n"
                + "-fx-border-width: 3;\n";
        this.setStyle(cssDefault);
    }




    static ImageView getImage(String path){
        ImageView image;
        try {
            Image fileImage = new Image(new FileInputStream(path));
            image = new ImageView(fileImage);
            return image;
        }catch (Exception e){
            System.out.println("ERR"+ e.getMessage());
            System.exit(1);
        }
        return  null;
    }

}


