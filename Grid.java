package animalrescuediderot;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.util.LinkedList;

public class Grid {
    private int h;
    private int w;
    private Case[][] grid;
    public GridPane mainPane;

    public Grid(int h, int w) {
        this.mainPane = new GridPane();
        this.h = h;
        this.w = w;
        this.grid = new Case[h][w];
        //Init Case
        for(int i = 0; i < this.grid.length; i++) {
            for(int j = 0; j < this.grid[i].length; j++) {
                this.grid[i][j] = new Case(this);
            }
        }
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public GridPane getMainPane () {
        return this.mainPane;
    }

    public Case[][] getGrid() {
        return this.grid;
    }
}
