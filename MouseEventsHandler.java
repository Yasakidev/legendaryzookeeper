package animalrescuediderot;
import javafx.event.EventHandler;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.input.MouseEvent;

public class MouseEventsHandler implements EventHandler<MouseEvent> {

    private HelloImage lastClicked;

    public MouseEventsHandler() {

    }

    @Override
    public void handle(MouseEvent event) {
        if(event.getSource() instanceof HelloImage) {
            //If there is one element different from the source, swap the two elements and empty the table.
            if(this.lastClicked != null && this.lastClicked != event.getSource()) {
                System.out.println("Swapping " + lastClicked + " with " + event.getSource() + " !");
                lastClicked.getImage().setEffect(null);
                lastClicked = null;
            }

            else if (this.lastClicked == event.getSource()) {
                System.out.println("Cant swap an element with itself !");
            }

            else { //If there is no element, fill the lastClicked
                this.lastClicked = (HelloImage) event.getSource();
                GaussianBlur b = new GaussianBlur();
                this.lastClicked.getImage().setEffect(b);
                System.out.println(this.lastClicked + " was clicked !");
            }
        }
    }

}
