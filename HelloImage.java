package animalrescuediderot;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.FileInputStream;


public class HelloImage extends AnchorPane {

    public ImageView image ;
    private static MouseEventsHandler handler; //Common to all HelloImages.

    static {
        handler = new MouseEventsHandler(); //Init Handler Common to All HelloImages.
    }

    public HelloImage() {
        this.image = importImage("src/animalrescuediderot/assets/square.png");
        this.getChildren().add(this.image);
        this.image.setLayoutX(10);
        this.image.setLayoutY(10);
        this.setEventHandler(MouseEvent.MOUSE_CLICKED, handler); //Fires click event.
    }


    public ImageView getImage() {
        return image;
    }

    public static ImageView importImage(String path){
        ImageView image;
        try {
            Image fileImage = new Image(new FileInputStream(path));
            image = new ImageView(fileImage);
            return image;
        }catch (Exception e){
            System.out.println("ERR : "+ e.getMessage());
            System.out.println("Current dir is : " + System.getProperty("Yser.dir"));
            System.exit(1);
        }
        return  null;
    }


}


