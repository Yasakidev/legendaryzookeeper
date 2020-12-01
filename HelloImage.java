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

    public HelloImage(Grid grid, String url) {
        this.image = importImage(url);
        this.image.setFitHeight(50);
        this.image.setFitWidth(50);
        this.getChildren().add(this.image);
        grid.getMainPane().getChildren().add(this);
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
            System.out.println("Current dir is : " + System.getProperty("User.dir"));
            System.exit(1);
        }
        return  null;
    }


}


